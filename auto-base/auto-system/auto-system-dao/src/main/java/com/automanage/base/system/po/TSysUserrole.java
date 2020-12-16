package com.automanage.base.system.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_sys_userrole")
public class TSysUserrole implements Serializable {
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "USER_ID")
    private BigDecimal userId;

    @Column(name = "ROLE_ID")
    private BigDecimal roleId;

    @Column(name = "CREATOR_ID")
    private BigDecimal creatorId;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "MODIFIER_ID")
    private BigDecimal modifierId;

    @Column(name = "MODIFY_DATE")
    private Date modifyDate;

    @Column(name = "VERSION")
    private BigDecimal version;

    private static final long serialVersionUID = 1L;

    /**
     * @return ID
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * @return USER_ID
     */
    public BigDecimal getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    /**
     * @return ROLE_ID
     */
    public BigDecimal getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    /**
     * @return CREATOR_ID
     */
    public BigDecimal getCreatorId() {
        return creatorId;
    }

    /**
     * @param creatorId
     */
    public void setCreatorId(BigDecimal creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return MODIFIER_ID
     */
    public BigDecimal getModifierId() {
        return modifierId;
    }

    /**
     * @param modifierId
     */
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * @return MODIFY_DATE
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * @return VERSION
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * @param version
     */
    public void setVersion(BigDecimal version) {
        this.version = version;
    }
}