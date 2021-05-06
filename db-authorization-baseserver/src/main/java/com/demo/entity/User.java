package com.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


public class User extends BaseDO {

    private static final long serialVersionUID = 1L;

    // 用户名
    private String userName;
    // 密码
    private String password;
    // 手机号
    private String phone;
    // 邮箱
    private String email;
    private Boolean deleted;
    private String deleteToken;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isDeleted() {
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
        return "User [userName=" + userName + ", password=" + password + ", phone=" + phone + ", email=" + email
                + ", deleted=" + deleted + ", deleteToken=" + deleteToken + ", id=" + id + ", createTime=" + createTime
                + ", updateTime=" + updateTime + ", creator=" + creator + ", updater=" + updater + "]";
    }
}