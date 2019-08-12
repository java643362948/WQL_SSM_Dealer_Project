package com.deepcoding.domain;

import java.util.Date;

public class Stock {
    private Integer id;//库存表id
    private Integer orderId;//商品种类id
    private Double price;//商品价格
    private Integer number;//商品数量
    private Date time;//时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", price=" + price +
                ", number=" + number +
                ", time=" + time +
                '}';
    }
}
