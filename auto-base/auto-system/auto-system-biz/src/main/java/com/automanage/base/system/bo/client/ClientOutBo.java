package com.automanage.base.system.bo.client;

import lombok.Data;

import java.util.List;

@Data
public class ClientOutBo {
    private Long id;
    private String username;
    private String password;
    private Integer status;
    private String clientId;
    private String code;
    private List<Integer> roles;
}
