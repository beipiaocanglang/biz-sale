package com.biz.domain;

import java.io.Serializable;

public class SaleLoginUser implements Serializable{
    /**
     * 主键id：uuid
     */
    private String id;

    /**
     * 用户姓名
     */
    private String name;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 登录名称（邮箱）
     */
    private String loginname;

    /**
     * 用户头像
     */
    private String displayimage;

    private Integer role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public String getDisplayimage() {
        return displayimage;
    }

    public void setDisplayimage(String displayimage) {
        this.displayimage = displayimage == null ? null : displayimage.trim();
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}