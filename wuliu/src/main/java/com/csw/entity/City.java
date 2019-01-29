package com.csw.entity;

public class City {
    private Integer city_id;

    private Integer province_id;

    private Integer district_id;

    private Integer pei_city_id;

    private String city_name;

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public Integer getProvince_id() {
        return province_id;
    }

    public void setProvince_id(Integer province_id) {
        this.province_id = province_id;
    }

    public Integer getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(Integer district_id) {
        this.district_id = district_id;
    }

    public Integer getPei_city_id() {
        return pei_city_id;
    }

    public void setPei_city_id(Integer pei_city_id) {
        this.pei_city_id = pei_city_id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name == null ? null : city_name.trim();
    }
}