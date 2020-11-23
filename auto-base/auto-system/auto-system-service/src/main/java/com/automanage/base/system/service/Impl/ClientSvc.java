package com.automanage.base.system.service.Impl;

import com.automanage.base.common.result.Result;
import com.automanage.base.common.util.BeanUtil;
import com.automanage.base.system.biz.ClientBiz;
import com.automanage.base.system.bo.client.ClientOutBo;
import com.automanage.base.system.dto.ClientDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@Service("ClientSvc")
@RestController
@RequestMapping("/users")
public class ClientSvc {
    @Resource
    private ClientBiz clientBiz;

    //@Override
    @GetMapping("/user/{username}")
    public Result<ClientDTO> loadUserByUsername(@PathVariable String username) throws Exception {
        //根据username获取用户信息
        ClientOutBo outBo = clientBiz.loadUserByUsername(username);
        Result<ClientDTO> result = null;
        if(outBo.getCode().equals("0000")){//成功获取用户
            ClientDTO client = new ClientDTO();
            BeanUtil.copyProperties(client,outBo);
            result = Result.success(client);
        }
        return result;
    }

}
