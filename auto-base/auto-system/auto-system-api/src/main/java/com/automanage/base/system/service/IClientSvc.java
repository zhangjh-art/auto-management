package com.automanage.base.system.service;

import com.automanage.base.common.result.Result;
import com.automanage.base.system.dto.ClientDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient("system-client")
public abstract class IClientSvc {
    @GetMapping("/users/user/{username}")
    public abstract Result<ClientDTO> loadUserByUsername(@PathVariable String username) throws Exception;
}
