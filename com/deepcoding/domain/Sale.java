package com.deepcoding.domain;

public class Sale {
    private Integer saleId;//销售表id
    private String type;//商品种类
    private String number;//商品数量
    private Double price;//商品价格

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "saleId=" + saleId +
                ", type='" + type + '\'' +
                ", number='" + number + '\'' +
                ", price=" + price +
                '}';
    }
}
