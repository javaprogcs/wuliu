package com.csw.entity;

public class Route {
    private Integer route_id;

    private String route_name;

    private Integer start_district_id;

    private Integer start_city_id;

    private String midpoint_district_id;

    private String midpoint_city_id;

    private String destination_district_id;

    private String destination_city_id;

    private Long carriage_price;

    private String route_comment;

    public Integer getRoute_id() {
        return route_id;
    }

    public void setRoute_id(Integer route_id) {
        this.route_id = route_id;
    }

    public String getRoute_name() {
        return route_name;
    }

    public void setRoute_name(String route_name) {
        this.route_name = route_name == null ? null : route_name.trim();
    }

    public Integer getStart_district_id() {
        return start_district_id;
    }

    public void setStart_district_id(Integer start_district_id) {
        this.start_district_id = start_district_id;
    }

    public Integer getStart_city_id() {
        return start_city_id;
    }

    public void setStart_city_id(Integer start_city_id) {
        this.start_city_id = start_city_id;
    }

    public String getMidpoint_district_id() {
        return midpoint_district_id;
    }

    public void setMidpoint_district_id(String midpoint_district_id) {
        this.midpoint_district_id = midpoint_district_id == null ? null : midpoint_district_id.trim();
    }

    public String getMidpoint_city_id() {
        return midpoint_city_id;
    }

    public void setMidpoint_city_id(String midpoint_city_id) {
        this.midpoint_city_id = midpoint_city_id == null ? null : midpoint_city_id.trim();
    }

    public String getDestination_district_id() {
        return destination_district_id;
    }

    public void setDestination_district_id(String destination_district_id) {
        this.destination_district_id = destination_district_id == null ? null : destination_district_id.trim();
    }

    public String getDestination_city_id() {
        return destination_city_id;
    }

    public void setDestination_city_id(String destination_city_id) {
        this.destination_city_id = destination_city_id == null ? null : destination_city_id.trim();
    }

    public Long getCarriage_price() {
        return carriage_price;
    }

    public void setCarriage_price(Long carriage_price) {
        this.carriage_price = carriage_price;
    }

    public String getRoute_comment() {
        return route_comment;
    }

    public void setRoute_comment(String route_comment) {
        this.route_comment = route_comment == null ? null : route_comment.trim();
    }
}