package com.deepcoding.domain;

public class Whole {
    private Integer id;//经销商订单id
    private Integer manufacturerId;//厂家商品的id
    private Integer manufactorId;//厂商的id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Integer manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public Integer getManufactorId() {
        return manufactorId;
    }

    public void setManufactorId(Integer manufactorId) {
        this.manufactorId = manufactorId;
    }

    @Override
    public String toString() {
        return "Whole{" +
                "id=" + id +
                ", manufacturerId=" + manufacturerId +
                ", manufactorId=" + manufactorId +
                '}';
    }
}
