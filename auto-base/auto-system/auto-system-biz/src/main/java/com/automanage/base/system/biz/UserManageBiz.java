package com.automanage.base.system.biz;

import com.automanage.base.common.util.BeanUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.automanage.base.system.bo.user.UserManagerBO;
import com.automanage.base.system.bo.user.UserManagerInBO;
import com.automanage.base.system.bo.user.UserManagerOutBO;
import com.automanage.base.system.mapper.TSysMenuMapper;
import com.automanage.base.system.mapper.TSysTargetpermissionMapper;
import com.automanage.base.system.mapper.TSysUserMapper;
import com.automanage.base.system.mapper.TSysUserroleMapper;
import com.automanage.base.system.po.TSysMenu;
import com.automanage.base.system.po.TSysTargetpermission;
import com.automanage.base.system.po.TSysUser;
import com.automanage.base.system.po.TSysUserrole;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import tk.mybatis.mapper.entity.Example;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@Setter
@Slf4j
public class UserManageBiz {
    @Resource
    //用户表
    private TSysUserMapper tSysUserMapper;

    @Resource
    //权限表
    private TSysTargetpermissionMapper tSysTargetpermissionMapper;

    @Resource
    //菜单表
    private TSysMenuMapper tSysMenuMapper;

    @Resource
    //角色表
    private TSysUserroleMapper tSysUserroleMapper;

    public Map<String, Object> getUserInfoByName(String username) throws Exception {
        Map<String,Object> result = new HashMap();
        //查询用户基础信息
        Example userExample = new Example(TSysUser.class);
        Example.Criteria userCriteria = userExample.createCriteria();
        userCriteria.andEqualTo("name",username);
        List<TSysUser> userList = tSysUserMapper.selectByExample(userExample);
        if(userList.size()>0){
            result.put("user",userList.get(0));
        }else{
            result.put("code","8888");
            result.put("msg","查询用户失败！");
            throw new Exception("查询用户失败！");
        }
        //查询用户菜单权限
        List<TSysMenu> menuList = new ArrayList();
        Example permissionExample = new Example(TSysTargetpermission.class);
        Example.Criteria permissionrCriteria = permissionExample.createCriteria();
        permissionrCriteria.andEqualTo("targetId",userList.get(0).getId());
        permissionrCriteria.andEqualTo("targetType","1");
        List<TSysTargetpermission> permissionList = tSysTargetpermissionMapper.selectByExample(permissionExample);
        for(int i = 0; i < permissionList.size(); i++){
            menuList.add(tSysMenuMapper.selectByPrimaryKey(permissionList.get(i).getPermissionId()));
        }
        //查询用户角色
        Example userroleExample = new Example(TSysUserrole.class);
        Example.Criteria userroleCriteria = userroleExample.createCriteria();
        userroleCriteria.andEqualTo("userId",userList.get(0).getId());
        List<TSysUserrole> userroleList = tSysUserroleMapper.selectByExample(userroleExample);
        for(int i = 0; i < userroleList.size(); i++){
            Example tempPermissionExample = new Example(TSysTargetpermission.class);
            Example.Criteria tempPermissionrCriteria = tempPermissionExample.createCriteria();
            tempPermissionrCriteria.andEqualTo("targetId",userroleList.get(0).getRoleId());
            tempPermissionrCriteria.andEqualTo("targetType","2");
            List<TSysTargetpermission> tempPermissionList = tSysTargetpermissionMapper.selectByExample(tempPermissionExample);
            for(int j = 0; j < tempPermissionList.size(); j++){
                //暂时没加有效性验证
                menuList.add(tSysMenuMapper.selectByPrimaryKey(tempPermissionList.get(j).getPermissionId()));
            }
        }
        result.put("menuList",menuList);
        //查询用户特殊权限
        result.put("specialPermission","");
        result.put("code","0000");
        return result;
    }

    public UserManagerOutBO queryUserList(UserManagerInBO inBO) throws Exception {
        List<UserManagerBO> boList = new ArrayList<UserManagerBO>();
        UserManagerBO userManagerBO = inBO.getUserManagerBO();
        Example example = new Example(TSysUser.class);
        Example.Criteria criteria = example.createCriteria();
        if (!CollectionUtils.isEmpty(userManagerBO.getIdList())) {
            criteria.andIn("id", userManagerBO.getIdList());
        }
        if (StringUtils.isNotBlank(userManagerBO.getCode())) {
            criteria.andLike("code", "%" + userManagerBO.getCode() + "%");
        }
        if (StringUtils.isNotBlank(userManagerBO.getName())) {
            criteria.andLike("name", "%" + userManagerBO.getName() + "%");
        }
        if (StringUtils.isNotBlank(userManagerBO.getContactTelephone())) {
            criteria.andLike("contactTelephone", "%" + userManagerBO.getContactTelephone() + "%");
        }
        PageHelper.startPage(inBO.getPageNum(), inBO.getPageSize());
        PageInfo<TSysUser> pageInfo = new PageInfo<>(tSysUserMapper.selectByExample(example));


        List<TSysUser> tNbrNumberRulesList = pageInfo.getList();

        for (TSysUser rule : tNbrNumberRulesList) {
            UserManagerBO bo = new UserManagerBO();
            BeanUtil.copyProperties(bo, rule);
            bo.setPassword(null);//隐藏密码字段
            boList.add(bo);
        }

        UserManagerOutBO outBO = new UserManagerOutBO();
        outBO.setUserManagerBOList(boList);
        outBO.setTotal(pageInfo.getTotal());
        return outBO;
    }


}
