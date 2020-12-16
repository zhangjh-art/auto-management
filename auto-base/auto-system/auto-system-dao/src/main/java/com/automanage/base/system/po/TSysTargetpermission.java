package com.automanage.base.system.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_sys_targetpermission")
public class TSysTargetpermission implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    /**
     * 工号角色ID
     */
    @Column(name = "TARGET_ID")
    private BigDecimal targetId;

    /**
     * 对象类型:1工号；2角色
     */
    @Column(name = "TARGET_TYPE")
    private BigDecimal targetType;

    /**
     * 权限ID
     */
    @Column(name = "PERMISSION_ID")
    private BigDecimal permissionId;

    /**
     * 权限类型：1、菜单权限；2、界面组件权限（按钮、下拉框）3、特殊权限
     */
    @Column(name = "PERMISSION_TYPE")
    private BigDecimal permissionType;

    /**
     * 操作编码
     */
    @Column(name = "OPERATER_TYPE_CODE")
    private String operaterTypeCode;

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
     * 获取工号角色ID
     *
     * @return TARGET_ID - 工号角色ID
     */
    public BigDecimal getTargetId() {
        return targetId;
    }

    /**
     * 设置工号角色ID
     *
     * @param targetId 工号角色ID
     */
    public void setTargetId(BigDecimal targetId) {
        this.targetId = targetId;
    }

    /**
     * 获取对象类型:1工号；2角色
     *
     * @return TARGET_TYPE - 对象类型:1工号；2角色
     */
    public BigDecimal getTargetType() {
        return targetType;
    }

    /**
     * 设置对象类型:1工号；2角色
     *
     * @param targetType 对象类型:1工号；2角色
     */
    public void setTargetType(BigDecimal targetType) {
        this.targetType = targetType;
    }

    /**
     * 获取权限ID
     *
     * @return PERMISSION_ID - 权限ID
     */
    public BigDecimal getPermissionId() {
        return permissionId;
    }

    /**
     * 设置权限ID
     *
     * @param permissionId 权限ID
     */
    public void setPermissionId(BigDecimal permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * 获取权限类型：1、菜单权限；2、界面组件权限（按钮、下拉框）3、特殊权限
     *
     * @return PERMISSION_TYPE - 权限类型：1、菜单权限；2、界面组件权限（按钮、下拉框）3、特殊权限
     */
    public BigDecimal getPermissionType() {
        return permissionType;
    }

    /**
     * 设置权限类型：1、菜单权限；2、界面组件权限（按钮、下拉框）3、特殊权限
     *
     * @param permissionType 权限类型：1、菜单权限；2、界面组件权限（按钮、下拉框）3、特殊权限
     */
    public void setPermissionType(BigDecimal permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * 获取操作编码
     *
     * @return OPERATER_TYPE_CODE - 操作编码
     */
    public String getOperaterTypeCode() {
        return operaterTypeCode;
    }

    /**
     * 设置操作编码
     *
     * @param operaterTypeCode 操作编码
     */
    public void setOperaterTypeCode(String operaterTypeCode) {
        this.operaterTypeCode = operaterTypeCode == null ? null : operaterTypeCode.trim();
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