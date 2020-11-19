package com.automanage.base.system.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class ClientDTO {

    private Long id;
    private String username;
    private String password;
    private Integer status;
    private String clientId;
    private List<Integer> roles;

}
