package com.deepcoding.domain;

import java.util.Date;

public class Agent {
    private Integer agentId;//代理表id
    private String name;//代理商姓名
    private String type;//商品种类
    private Double price;//商品价格
    private Integer number;//商品数量
    private Date time;//时间
    private String contacts;//联系人
    private String mode;//联系方式

    public Integer getAgentId() {
        return agentId;
    }

    public void setAgentId(Integer agentId) {
        this.agentId = agentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentId=" + agentId +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", number=" + number +
                ", time=" + time +
                ", contacts='" + contacts + '\'' +
                ", mode='" + mode + '\'' +
                '}';
    }
}
