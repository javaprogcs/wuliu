package com.csw.entity;

public class Admin {
    private Integer admin_id;

    private Integer user_id;

    private String admin_name;

    private String admin_sex;

    private String admin_state;

    private String admin_city;

    private String admin_address;

    private String admin_pwd;

    private String admin_tel;

    private String commend;

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name == null ? null : admin_name.trim();
    }

    public String getAdmin_sex() {
        return admin_sex;
    }

    public void setAdmin_sex(String admin_sex) {
        this.admin_sex = admin_sex == null ? null : admin_sex.trim();
    }

    public String getAdmin_state() {
        return admin_state;
    }

    public void setAdmin_state(String admin_state) {
        this.admin_state = admin_state == null ? null : admin_state.trim();
    }

    public String getAdmin_city() {
        return admin_city;
    }

    public void setAdmin_city(String admin_city) {
        this.admin_city = admin_city == null ? null : admin_city.trim();
    }

    public String getAdmin_address() {
        return admin_address;
    }

    public void setAdmin_address(String admin_address) {
        this.admin_address = admin_address == null ? null : admin_address.trim();
    }

    public String getAdmin_pwd() {
        return admin_pwd;
    }

    public void setAdmin_pwd(String admin_pwd) {
        this.admin_pwd = admin_pwd == null ? null : admin_pwd.trim();
    }

    public String getAdmin_tel() {
        return admin_tel;
    }

    public void setAdmin_tel(String admin_tel) {
        this.admin_tel = admin_tel == null ? null : admin_tel.trim();
    }

    public String getCommend() {
        return commend;
    }

    public void setCommend(String commend) {
        this.commend = commend == null ? null : commend.trim();
    }
}