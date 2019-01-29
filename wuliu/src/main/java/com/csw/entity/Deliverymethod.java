package com.csw.entity;

public class Deliverymethod {
    private Integer del_id;

    private String del_name;

    private Long peisong_price;

    private Integer del_city_id;

    private String peisong_comment;

    public Integer getDel_id() {
        return del_id;
    }

    public void setDel_id(Integer del_id) {
        this.del_id = del_id;
    }

    public String getDel_name() {
        return del_name;
    }

    public void setDel_name(String del_name) {
        this.del_name = del_name == null ? null : del_name.trim();
    }

    public Long getPeisong_price() {
        return peisong_price;
    }

    public void setPeisong_price(Long peisong_price) {
        this.peisong_price = peisong_price;
    }

    public Integer getDel_city_id() {
        return del_city_id;
    }

    public void setDel_city_id(Integer del_city_id) {
        this.del_city_id = del_city_id;
    }

    public String getPeisong_comment() {
        return peisong_comment;
    }

    public void setPeisong_comment(String peisong_comment) {
        this.peisong_comment = peisong_comment == null ? null : peisong_comment.trim();
    }
}