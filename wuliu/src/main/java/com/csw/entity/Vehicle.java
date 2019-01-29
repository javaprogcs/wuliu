package com.csw.entity;

import java.util.Date;

public class Vehicle {
    private Integer vehicle_id;

    private Integer route_id;

    private String vehicle_type;

    private String yieldly;

    private Date production_date;

    private Date buy_date;

    private String vehicle_comment;

    public Integer getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(Integer vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public Integer getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Integer route_id) {
        this.route_id = route_id;
    }

    public String getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(String vehicle_type) {
        this.vehicle_type = vehicle_type == null ? null : vehicle_type.trim();
    }

    public String getYieldly() {
        return yieldly;
    }

    public void setYieldly(String yieldly) {
        this.yieldly = yieldly == null ? null : yieldly.trim();
    }

    public Date getProduction_date() {
        return production_date;
    }

    public void setProduction_date(Date production_date) {
        this.production_date = production_date;
    }

    public Date getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }

    public String getVehicle_comment() {
        return vehicle_comment;
    }

    public void setVehicle_comment(String vehicle_comment) {
        this.vehicle_comment = vehicle_comment == null ? null : vehicle_comment.trim();
    }
}