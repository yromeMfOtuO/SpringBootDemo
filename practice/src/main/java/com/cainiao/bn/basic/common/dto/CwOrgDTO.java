package com.cainiao.bn.basic.common.dto;

import java.io.Serializable;
import java.util.Date;


public class CwOrgDTO  implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     *  主键
     */
    private Long id;

    /**
     *  创建时间
     */
    private Date gmtCreate;

    /**
     *  修改时间
     */
    private Date gmtModified;

    /**
     *  创建人花名
     */
    private String creator;

    /**
     *  修改人花名
     */
    private String modifier;

    /**
     *  组织名称
     */
    private String orgName;

    /**
     *  组织描述
     */
    private String orgDesc;

    /**
     *  删除标志 , 0未删除 1已删除
     */
    private Byte isDeleted;

    public void setId(Long id) {
        this.id = id;
     }

    public Long getId() {
        return this.id;
     }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
     }

    public Date getGmtCreate() {
        return this.gmtCreate;
     }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
     }

    public Date getGmtModified() {
        return this.gmtModified;
     }

    public void setCreator(String creator) {
        this.creator = creator;
     }

    public String getCreator() {
        return this.creator;
     }

    public void setModifier(String modifier) {
        this.modifier = modifier;
     }

    public String getModifier() {
        return this.modifier;
     }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
     }

    public String getOrgName() {
        return this.orgName;
     }

    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc;
     }

    public String getOrgDesc() {
        return this.orgDesc;
     }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
     }

    public Byte getIsDeleted() {
        return this.isDeleted;
     }
}