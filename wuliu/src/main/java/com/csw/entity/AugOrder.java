package com.csw.entity;

public class AugOrder {
    private Integer order_id;

    private Integer delivery_id;

    private String order_type;

    private String cargo_name;

    private Double cargo_weight;

    private String sender_name;

    private String sender_address;

    private String delivery_address;

    private String order_state;

    private String sender_tel;

    private String consignee;

    private String consignee_tel;

    private String start_city;

    private String midpoint_city;

    private String destination_city;

    private Long transport_price;

    private Long delivery_price;

    private Long carriage_price;

    private Long total_price;

    private String vehicle;

    private String order_comment;

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(Integer delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getOrder_type() {
        return order_type;
    }

    public void setOrder_type(String order_type) {
        this.order_type = order_type == null ? null : order_type.trim();
    }

    public String getCargo_name() {
        return cargo_name;
    }

    public void setCargo_name(String cargo_name) {
        this.cargo_name = cargo_name == null ? null : cargo_name.trim();
    }

    public Double getCargo_weight() {
        return cargo_weight;
    }

    public void setCargo_weight(Double cargo_weight) {
        this.cargo_weight = cargo_weight;
    }

    public String getSender_name() {
        return sender_name;
    }

    public void setSender_name(String sender_name) {
        this.sender_name = sender_name == null ? null : sender_name.trim();
    }

    public String getSender_address() {
        return sender_address;
    }

    public void setSender_address(String sender_address) {
        this.sender_address = sender_address == null ? null : sender_address.trim();
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address == null ? null : delivery_address.trim();
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state == null ? null : order_state.trim();
    }

    public String getSender_tel() {
        return sender_tel;
    }

    public void setSender_tel(String sender_tel) {
        this.sender_tel = sender_tel == null ? null : sender_tel.trim();
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    public String getConsignee_tel() {
        return consignee_tel;
    }

    public void setConsignee_tel(String consignee_tel) {
        this.consignee_tel = consignee_tel == null ? null : consignee_tel.trim();
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

    public Long getTransport_price() {
        return transport_price;
    }

    public void setTransport_price(Long transport_price) {
        this.transport_price = transport_price;
    }

    public Long getDelivery_price() {
        return delivery_price;
    }

    public void setDelivery_price(Long delivery_price) {
        this.delivery_price = delivery_price;
    }

    public Long getCarriage_price() {
        return carriage_price;
    }

    public void setCarriage_price(Long carriage_price) {
        this.carriage_price = carriage_price;
    }

    public Long getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Long total_price) {
        this.total_price = total_price;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle == null ? null : vehicle.trim();
    }

    public String getOrder_comment() {
        return order_comment;
    }

    public void setOrder_comment(String order_comment) {
        this.order_comment = order_comment == null ? null : order_comment.trim();
    }
}