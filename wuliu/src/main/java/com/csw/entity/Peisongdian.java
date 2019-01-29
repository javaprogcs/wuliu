package com.csw.entity;

public class Peisongdian {
    private Integer peisongdian_id;

    private Integer pei_province_id;

    private Integer pei_city_id;

    private Integer admin_id;

    private String peisongdian_name;

    private String peisongdian_tel;

    private String peisongdian_address;

    private String peisongdian_comment;

    public Integer getPeisongdian_id() {
        return peisongdian_id;
    }

    public void setPeisongdian_id(Integer peisongdian_id) {
        this.peisongdian_id = peisongdian_id;
    }

    public Integer getPei_province_id() {
        return pei_province_id;
    }

    public void setPei_province_id(Integer pei_province_id) {
        this.pei_province_id = pei_province_id;
    }

    public Integer getPei_city_id() {
        return pei_city_id;
    }

    public void setPei_city_id(Integer pei_city_id) {
        this.pei_city_id = pei_city_id;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getPeisongdian_name() {
        return peisongdian_name;
    }

    public void setPeisongdian_name(String peisongdian_name) {
        this.peisongdian_name = peisongdian_name == null ? null : peisongdian_name.trim();
    }

    public String getPeisongdian_tel() {
        return peisongdian_tel;
    }

    public void setPeisongdian_tel(String peisongdian_tel) {
        this.peisongdian_tel = peisongdian_tel == null ? null : peisongdian_tel.trim();
    }

    public String getPeisongdian_address() {
        return peisongdian_address;
    }

    public void setPeisongdian_address(String peisongdian_address) {
        this.peisongdian_address = peisongdian_address == null ? null : peisongdian_address.trim();
    }

    public String getPeisongdian_comment() {
        return peisongdian_comment;
    }

    public void setPeisongdian_comment(String peisongdian_comment) {
        this.peisongdian_comment = peisongdian_comment == null ? null : peisongdian_comment.trim();
    }
}