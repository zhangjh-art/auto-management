package com.automanage.base.system.po;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_sys_menu")
public class TSysMenu implements Serializable {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private BigDecimal id;

    /**
     * 功能编码
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 功能名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 功能名称（英语）
     */
    @Column(name = "NAME_EN")
    private String nameEn;

    /**
     * 访问路径
     */
    @Column(name = "PAGE_URL")
    private String pageUrl;

    /**
     * 功能图标
     */
    @Column(name = "ICON")
    private String icon;

    /**
     * 父菜单 （类型是菜单：对应的是菜单ID，类型是菜单组件：对应的是上级菜单ID）
     */
    @Column(name = "PARENTID")
    private BigDecimal parentid;

    /**
     * 是否有效
     */
    @Column(name = "VALID_IS")
    private BigDecimal validIs;

    /**
     * 是否叶子节点
     */
    @Column(name = "LEAFIS")
    private BigDecimal leafis;

    /**
     * 备注
     */
    @Column(name = "NOTE")
    private String note;

    /**
     * 序号
     */
    @Column(name = "SEQ")
    private BigDecimal seq;

    /**
     * 创建人ID
     */
    @Column(name = "CREATOR_ID")
    private BigDecimal creatorId;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 最后修改人ID
     */
    @Column(name = "MODIFIER_ID")
    private BigDecimal modifierId;

    /**
     * 最后修改时间
     */
    @Column(name = "MODIFY_DATE")
    private Date modifyDate;

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
     * 获取功能编码
     *
     * @return CODE - 功能编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置功能编码
     *
     * @param code 功能编码
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * 获取功能名称
     *
     * @return NAME - 功能名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置功能名称
     *
     * @param name 功能名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取功能名称（英语）
     *
     * @return NAME_EN - 功能名称（英语）
     */
    public String getNameEn() {
        return nameEn;
    }

    /**
     * 设置功能名称（英语）
     *
     * @param nameEn 功能名称（英语）
     */
    public void setNameEn(String nameEn) {
        this.nameEn = nameEn == null ? null : nameEn.trim();
    }

    /**
     * 获取访问路径
     *
     * @return PAGE_URL - 访问路径
     */
    public String getPageUrl() {
        return pageUrl;
    }

    /**
     * 设置访问路径
     *
     * @param pageUrl 访问路径
     */
    public void setPageUrl(String pageUrl) {
        this.pageUrl = pageUrl == null ? null : pageUrl.trim();
    }

    /**
     * 获取功能图标
     *
     * @return ICON - 功能图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置功能图标
     *
     * @param icon 功能图标
     */
    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    /**
     * 获取父菜单 （类型是菜单：对应的是菜单ID，类型是菜单组件：对应的是上级菜单ID）
     *
     * @return PARENTID - 父菜单 （类型是菜单：对应的是菜单ID，类型是菜单组件：对应的是上级菜单ID）
     */
    public BigDecimal getParentid() {
        return parentid;
    }

    /**
     * 设置父菜单 （类型是菜单：对应的是菜单ID，类型是菜单组件：对应的是上级菜单ID）
     *
     * @param parentid 父菜单 （类型是菜单：对应的是菜单ID，类型是菜单组件：对应的是上级菜单ID）
     */
    public void setParentid(BigDecimal parentid) {
        this.parentid = parentid;
    }

    /**
     * 获取是否有效
     *
     * @return VALID_IS - 是否有效
     */
    public BigDecimal getValidIs() {
        return validIs;
    }

    /**
     * 设置是否有效
     *
     * @param validIs 是否有效
     */
    public void setValidIs(BigDecimal validIs) {
        this.validIs = validIs;
    }

    /**
     * 获取是否叶子节点
     *
     * @return LEAFIS - 是否叶子节点
     */
    public BigDecimal getLeafis() {
        return leafis;
    }

    /**
     * 设置是否叶子节点
     *
     * @param leafis 是否叶子节点
     */
    public void setLeafis(BigDecimal leafis) {
        this.leafis = leafis;
    }

    /**
     * 获取备注
     *
     * @return NOTE - 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置备注
     *
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    /**
     * 获取序号
     *
     * @return SEQ - 序号
     */
    public BigDecimal getSeq() {
        return seq;
    }

    /**
     * 设置序号
     *
     * @param seq 序号
     */
    public void setSeq(BigDecimal seq) {
        this.seq = seq;
    }

    /**
     * 获取创建人ID
     *
     * @return CREATOR_ID - 创建人ID
     */
    public BigDecimal getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建人ID
     *
     * @param creatorId 创建人ID
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
     * 获取最后修改人ID
     *
     * @return MODIFIER_ID - 最后修改人ID
     */
    public BigDecimal getModifierId() {
        return modifierId;
    }

    /**
     * 设置最后修改人ID
     *
     * @param modifierId 最后修改人ID
     */
    public void setModifierId(BigDecimal modifierId) {
        this.modifierId = modifierId;
    }

    /**
     * 获取最后修改时间
     *
     * @return MODIFY_DATE - 最后修改时间
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置最后修改时间
     *
     * @param modifyDate 最后修改时间
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}