package com.automanage.base.system.service;

import com.automanage.base.system.dto.ClientDTO;
import com.automanage.base.common.result.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FeignClient("base-system")
public interface IClientSvc {
    @GetMapping("/users/user/{username}")
    Result<ClientDTO> loadUserByUsername(@PathVariable String username) throws Exception;
}
