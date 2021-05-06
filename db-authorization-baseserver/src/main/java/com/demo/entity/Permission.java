package com.demo.entity;


import javax.persistence.Entity;
import javax.persistence.Table;


public class Permission extends BaseDO {

    private static final long serialVersionUID = 1L;

    // 父权限
    private String parentId;
    // 权限中文名称
    private String chName;
    // 权限英文名称
    private String enName;
    private String url;
    private String description;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Permission [parentId=" + parentId + ", chName=" + chName + ", enName=" + enName + ", url=" + url
                + ", description=" + description + ", id=" + id + ", createTime=" + createTime + ", updateTime="
                + updateTime + ", creator=" + creator + ", updater=" + updater + "]";
    }
}