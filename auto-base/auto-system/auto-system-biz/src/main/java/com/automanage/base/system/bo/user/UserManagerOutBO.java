package com.automanage.base.system.bo.user;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * 用户管理出参类
 * @author dousl
 * @Date: 2018-11-27 18:06
 * @Description:
 */
@Setter
@Getter
@ToString
public class UserManagerOutBO {
    private Integer pageNum;
    private Integer pageSize;
    private Long total;
    private List<UserManagerBO> userManagerBOList;
}
