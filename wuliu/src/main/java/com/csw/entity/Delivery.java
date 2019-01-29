package com.csw.entity;

import java.util.Date;

public class Delivery {
    private Integer delivery_id;

    private String start_city;

    private String midpoint_city;

    private String destination_city;

    private String delivery_state;

    private Date rise_time;

    private String delivery_comment;

    public Integer getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(Integer delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getStart_city() {
        return start_city;
    }

    public void setStart_city(String start_city) {
        this.start_city = start_city == null ? null : start_city.trim();
    }

    public String getMidpoint_city() {
        return midpoint_city;
    }

    public void setMidpoint_city(String midpoint_city) {
        this.midpoint_city = midpoint_city == null ? null : midpoint_city.trim();
    }

    public String getDestination_city() {
        return destination_city;
    }

    public void setDestination_city(String destination_city) {
        this.destination_city = destination_city == null ? null : destination_city.trim();
    }

    public String getDelivery_state() {
        return delivery_state;
    }

    public void setDelivery_state(String delivery_state) {
        this.delivery_state = delivery_state == null ? null : delivery_state.trim();
    }

    public Date getRise_time() {
        return rise_time;
    }

    public void setRise_time(Date rise_time) {
        this.rise_time = rise_time;
    }

    public String getDelivery_comment() {
        return delivery_comment;
    }

    public void setDelivery_comment(String delivery_comment) {
        this.delivery_comment = delivery_comment == null ? null : delivery_comment.trim();
    }
}