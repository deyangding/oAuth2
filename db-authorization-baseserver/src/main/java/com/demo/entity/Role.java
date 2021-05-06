package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


public class Role extends BaseDO {

    private static final long serialVersionUID = 1L;

    // 父角色
    private String parentId;
    // 角色中文名称
    private String chName;
    // 角色英文名称
    private String enName;
    private String description;
    private Boolean deleted;
    private String deleteToken;

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getChName() {
        return chName;
    }

    public void setChName(String chName) {
        this.chName = chName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public String getDeleteToken() {
        return deleteToken;
    }

    public void setDeleteToken(String deleteToken) {
        this.deleteToken = deleteToken;
    }

    @Override
    public String toString() {
        return "Role [parentId=" + parentId + ", chName=" + chName + ", enName=" + enName + ", description="
                + description + ", deleted=" + deleted + ", deleteToken=" + deleteToken + ", id=" + id + ", createTime="
                + createTime + ", updateTime=" + updateTime + ", creator=" + creator + ", updater=" + updater + "]";
    }

}