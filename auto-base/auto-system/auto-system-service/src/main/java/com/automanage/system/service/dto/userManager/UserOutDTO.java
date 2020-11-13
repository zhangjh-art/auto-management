package com.automanage.system.service.dto.userManager;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 用户管理出参实体
 *
 * @author dousl
 */
@Setter
@Getter
@ToString
public class UserOutDTO {
    @JsonProperty("Data")
    private List<UserDTO> data;

    private Integer pageNum;
    private Integer pageSize;
    private Long total;
}
