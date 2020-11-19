package com.automanage.base.system.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_sys_user")
public class TSysUser implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    /**
     * 工号编码
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 工号名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 密码
     */
    @Column(name = "PASSWORD")
    private String password;

    /**
     * 所属区域
     */
    @Column(name = "REGION_ID")
    private BigDecimal regionId;

    /**
     * 职务
     */
    @Column(name = "DUTY_ID")
    private BigDecimal dutyId;

    /**
     * 登录次数
     */
    @Column(name = "LOGIN_NUM")
    private BigDecimal loginNum;

    /**
     * 所属部门
     */
    @Column(name = "DEPARTMENT_ID")
    private BigDecimal departmentId;

    /**
     * 描述
     */
    @Column(name = "DESCRIPTION")
    private String description;

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

    /**
     * 联系电话
     */
    @Column(name = "CONTACT_TELEPHONE")
    private String contactTelephone;

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
     * 获取工号编码
     *
     * @return CODE - 工号编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置工号编码
     *
     * @param code 工号编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取工号名称
     *
     * @return NAME - 工号名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置工号名称
     *
     * @param name 工号名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取密码
     *
     * @return PASSWORD - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取所属区域
     *
     * @return REGION_ID - 所属区域
     */
    public BigDecimal getRegionId() {
        return regionId;
    }

    /**
     * 设置所属区域
     *
     * @param regionId 所属区域
     */
    public void setRegionId(BigDecimal regionId) {
        this.regionId = regionId;
    }

    /**
     * 获取职务
     *
     * @return DUTY_ID - 职务
     */
    public BigDecimal getDutyId() {
        return dutyId;
    }

    /**
     * 设置职务
     *
     * @param dutyId 职务
     */
    public void setDutyId(BigDecimal dutyId) {
        this.dutyId = dutyId;
    }

    /**
     * 获取登录次数
     *
     * @return LOGIN_NUM - 登录次数
     */
    public BigDecimal getLoginNum() {
        return loginNum;
    }

    /**
     * 设置登录次数
     *
     * @param loginNum 登录次数
     */
    public void setLoginNum(BigDecimal loginNum) {
        this.loginNum = loginNum;
    }

    /**
     * 获取所属部门
     *
     * @return DEPARTMENT_ID - 所属部门
     */
    public BigDecimal getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置所属部门
     *
     * @param departmentId 所属部门
     */
    public void setDepartmentId(BigDecimal departmentId) {
        this.departmentId = departmentId;
    }

    /**
     * 获取描述
     *
     * @return DESCRIPTION - 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     *
     * @param description 描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    /**
     * 获取联系电话
     *
     * @return CONTACT_TELEPHONE - 联系电话
     */
    public String getContactTelephone() {
        return contactTelephone;
    }

    /**
     * 设置联系电话
     *
     * @param contactTelephone 联系电话
     */
    public void setContactTelephone(String contactTelephone) {
        this.contactTelephone = contactTelephone == null ? null : contactTelephone.trim();
    }
}