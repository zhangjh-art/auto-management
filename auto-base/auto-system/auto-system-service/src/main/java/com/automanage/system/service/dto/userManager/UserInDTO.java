package com.automanage.system.service.dto.userManager;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 用户管理实体
 *
 * @author dousl
 */
@Setter
@Getter
@ToString
public class UserInDTO {
    @JsonProperty("Data")
    private UserDTO data;

    private Integer pageNum;
    private Integer pageSize;
    private Long pageTotal;
    private BigDecimal operator;

    private BigDecimal depotId;
    private BigDecimal cityId;
}
