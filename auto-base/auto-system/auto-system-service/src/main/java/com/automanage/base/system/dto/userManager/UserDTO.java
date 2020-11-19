package com.automanage.base.system.dto.userManager;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * 用户管理实体类
 */
@Setter
@Getter
@ToString
public class UserDTO {

    /**
     * ID
     */

    private BigDecimal id;

    /**
     * 工号编码
     */
    private String code;

    /**
     * 工号名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 所属区域
     */
    private BigDecimal regionId;
    private String vRegionId;

    /**
     * 职务
     */
    private BigDecimal dutyId;
    private String vDutyId;

    /**
     * 登录次数
     */
    private Integer loginNum;

    /**
     * 所属部门
     */
    private BigDecimal departmentId;
    private String vDepartmentId;

    /**
     * 描述
     */
    private String description;

    /**
     * 创建人
     */
    private BigDecimal creatorId;
    private String vCreatorId;

    /**
     * 创建时间
     */
    private Date createDate;
    private String vCreateDate;

    /**
     * 修改人
     */
    private BigDecimal modifierId;
    private String vModifierId;

    /**
     * 修改时间
     */
    private Date modifyDate;
    private String vModifyDate;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 联系电话
     */
    private String contactTelephone;

    /**
     * id列表
     */
    private List<String> idList;

    /**
     * roleIdList列表
     */
    private List<String> roleIdList;

    private BigDecimal cityId;
    private String vCityId;


}
