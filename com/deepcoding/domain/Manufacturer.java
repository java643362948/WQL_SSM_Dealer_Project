package com.deepcoding.domain;

import java.util.Date;

public class Manufacturer {
    private Integer id;//厂商商品表id
    private String kind;//商品种类
    private Double price;//商品价格
    private Integer stock;//库存
    private Date shelfTime;//上架时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Date getShelfTime() {
        return shelfTime;
    }

    public void setShelfTime(Date shelfTime) {
        this.shelfTime = shelfTime;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + id +
                ", kind='" + kind + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", shelfTime=" + shelfTime +
                '}';
    }
}
