package com.deepcoding.domain;

public class SalesRecords {
    private Integer id;//销售记录表的id
    private Integer stockId;//库存表的id
    private Integer saleId;//销售的id

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    @Override
    public String toString() {
        return "SalesRecords{" +
                "id=" + id +
                ", stockId=" + stockId +
                ", saleId=" + saleId +
                '}';
    }
}
