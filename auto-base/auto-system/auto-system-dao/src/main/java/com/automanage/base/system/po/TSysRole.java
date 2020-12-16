package com.automanage.base.system.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_sys_role")
public class TSysRole implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    /**
     * 角色编码
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 角色名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 角色常量
     */
    @Column(name = "CONSTANT_NAME")
    private String constantName;

    /**
     * 描述
     */
    @Column(name = "ROLE_DESC")
    private String roleDesc;

    /**
     * 角色状态（已用、停用）
     */
    @Column(name = "ROLE_STATE")
    private BigDecimal roleState;

    /**
     * 创建人
     */
    @Column(name = "CREATOR_ID")
    private BigDecimal creatorId;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 修改人
     */
    @Column(name = "MODIFIER_ID")
    private BigDecimal modifierId;

    /**
     * 修改时间
     */
    @Column(name = "MODIFY_DATE")
    private Date modifyDate;

    /**
     * 版本
     */
    @Column(name = "VERSION")
    private BigDecimal version;

    private static final long serialVersionUID = 1L;

    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * 获取角色编码
     *
     * @return CODE - 角色编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置角色编码
     *
     * @param code 角色编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取角色名称
     *
     * @return NAME - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取角色常量
     *
     * @return CONSTANT_NAME - 角色常量
     */
    public String getConstantName() {
        return constantName;
    }

    /**
     * 设置角色常量
     *
     * @param constantName 角色常量
     */
    public void setConstantName(String constantName) {
        this.constantName = constantName == null ? null : constantName.trim();
    }

    /**
     * 获取描述
     *
     * @return ROLE_DESC - 描述
     */
    public String getRoleDesc() {
        return roleDesc;
    }

    /**
     * 设置描述
     *
     * @param roleDesc 描述
     */
    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    /**
     * 获取角色状态（已用、停用）
     *
     * @return ROLE_STATE - 角色状态（已用、停用）
     */
    public BigDecimal getRoleState() {
        return roleState;
    }

    /**
     * 设置角色状态（已用、停用）
     *
     * @param roleState 角色状态（已用、停用）
     */
    public void setRoleState(BigDecimal roleState) {
        this.roleState = roleState;
    }

    /**
     * 获取创建人
     *
     * @return CREATOR_ID - 创建人
     */
    public BigDecimal getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人
     *
     * @param creatorId 创建人
     */
    public void setCreatorId(BigDecimal creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_DATE - 创建时间
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间
     *
     * @param createDate 创建时间
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取修改人
     *
     * @return MODIFIER_ID - 修改人
     */
    public BigDecimal getModifierId() {
        return modifierId;
    }

    /**
     * 设置修改人
     *
     * @param modifierId 修改人
     */
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * 获取修改时间
     *
     * @return MODIFY_DATE - 修改时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置修改时间
     *
     * @param modifyDate 修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 获取版本
     *
     * @return VERSION - 版本
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(BigDecimal version) {
        this.version = version;
    }
}