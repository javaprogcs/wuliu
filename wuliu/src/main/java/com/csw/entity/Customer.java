package com.csw.entity;

import java.util.Date;

public class Customer {
    private Integer cust_id;

    private String cust_name;

    private String cust_sex;

    private Integer user_id;

    private String cust_pwd;

    private String cust_tel;

    private Date cust_birthdate;

    private String cust_address;

    private String cust_comment;

    public Integer getCust_id() {
        return cust_id;
    }

    public void setCust_id(Integer cust_id) {
        this.cust_id = cust_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name == null ? null : cust_name.trim();
    }

    public String getCust_sex() {
        return cust_sex;
    }

    public void setCust_sex(String cust_sex) {
        this.cust_sex = cust_sex == null ? null : cust_sex.trim();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getCust_pwd() {
        return cust_pwd;
    }

    public void setCust_pwd(String cust_pwd) {
        this.cust_pwd = cust_pwd == null ? null : cust_pwd.trim();
    }

    public String getCust_tel() {
        return cust_tel;
    }

    public void setCust_tel(String cust_tel) {
        this.cust_tel = cust_tel == null ? null : cust_tel.trim();
    }

    public Date getCust_birthdate() {
        return cust_birthdate;
    }

    public void setCust_birthdate(Date cust_birthdate) {
        this.cust_birthdate = cust_birthdate;
    }

    public String getCust_address() {
        return cust_address;
    }

    public void setCust_address(String cust_address) {
        this.cust_address = cust_address == null ? null : cust_address.trim();
    }

    public String getCust_comment() {
        return cust_comment;
    }

    public void setCust_comment(String cust_comment) {
        this.cust_comment = cust_comment == null ? null : cust_comment.trim();
    }
}