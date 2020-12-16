package com.automanage.base.system.bo.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * 用户管理入参类
 *
 * @author : dousl
 * @Date: 2018-11-27 18:06
 * @Description:
 */
@Setter
@Getter
@ToString
public class UserManagerInBO {
    private Integer pageNum;
    private Integer pageSize;
    private Long pageTotal;
    private UserManagerBO userManagerBO;
    private BigDecimal operator;

    private BigDecimal depotId;
    private BigDecimal cityId;
}
