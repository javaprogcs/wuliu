package com.csw.entity;

public class Province {
    private Integer province_id;

    private String province_name;

    public Integer getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Integer province_id) {
        this.province_id = province_id;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String province_name) {
        this.province_name = province_name == null ? null : province_name.trim();
    }
}