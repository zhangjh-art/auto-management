package com.automanage.base.system.service.Impl;

import com.automanage.base.common.result.Result;
import com.automanage.base.common.util.BeanUtil;
import com.automanage.base.system.biz.UserManageBiz;
import com.automanage.base.system.bo.user.UserManagerBO;
import com.automanage.base.system.bo.user.UserManagerInBO;
import com.automanage.base.system.bo.user.UserManagerOutBO;
import com.automanage.base.system.dto.userManager.UserDTO;
import com.automanage.base.system.dto.userManager.UserInDTO;
import com.automanage.base.system.dto.userManager.UserOutDTO;
import com.automanage.base.system.service.IUserManagerSvc;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 用户管理相关服务
 *
 * @author dousl
 */
@Slf4j
@Service("UserManagerSvc")
@Setter
@RequestMapping("/userManage")
public class UserManagerSvc implements IUserManagerSvc {
    @Resource
    private UserManageBiz userManagerBiz;

    /**
     * @Description: 登录获取用户信息及权限
     * @Author :  zhangjh
     * @CreateDate :  2020/11/27
     */
    @Override
    @PostMapping("/getUserInfoByName")
    @ResponseBody
    public Result<Map<String, Object>> getUserInfoByName(@RequestBody Map<String, String> map) throws Exception {
        String username = map.get("username");
        Map<String, Object> userInfo = userManagerBiz.getUserInfoByName(username);
        Result result;
        if(userInfo.get("code").equals("0000")){
            result = Result.success(userInfo);
        }else{
            result = Result.error(userInfo.get("msg").toString());
        }
        return result;
    }

    /**
     * @Description: 根据条件查询用户列表
     * @Author :  zhangjh
     * @CreateDate :  2020/12/16
     * @return
     */
    @Override
    @PostMapping("/queryUserList")
    @ResponseBody
    public UserOutDTO queryUserList(@RequestBody UserInDTO inDTO) throws Exception {
        //初始化返回对象
        List<UserDTO> users = new ArrayList<>();
        UserOutDTO userManagerOutDTO = new UserOutDTO();
        //调用biz
        UserManagerBO userManagerBO = new UserManagerBO();
        BeanUtil.copyProperties(userManagerBO, inDTO.getData());
        //添加分页信息
        UserManagerInBO inBO = new UserManagerInBO();
        inBO.setUserManagerBO(userManagerBO);
        inBO.setPageNum(inDTO.getPageNum());
        inBO.setPageSize(inDTO.getPageSize());
        inBO.setOperator(inDTO.getOperator());
        UserManagerOutBO outBO = userManagerBiz.queryUserList(inBO);
        List<UserManagerBO> boList = outBO.getUserManagerBOList();
        for (UserManagerBO bo : boList) {
            UserDTO userDTO = new UserDTO();
            BeanUtil.copyProperties(userDTO, bo);
            users.add(userDTO);
        }
        userManagerOutDTO.setTotal(outBO.getTotal());
        userManagerOutDTO.setData(users);
        return userManagerOutDTO;
    }

}
