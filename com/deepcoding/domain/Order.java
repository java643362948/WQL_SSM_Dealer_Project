package com.deepcoding.domain;

import java.util.Date;

public class Order {
    private Integer id;//经销商订单表id
    private String type;//商品种类
    private Double price;//商品价格
    private Integer number;//商品数量
    private String manu;//厂家
    private Date time;//时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getManu() {
        return manu;
    }

    public void setManu(String manu) {
        this.manu = manu;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", manu='" + manu + '\'' +
                ", time=" + time +
                '}';
    }
}
