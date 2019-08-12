package com.deepcoding.domain;

public class Manufactor {
    private Integer id;//厂家表id
    private String name;//公司名称
    private String contact;//联系方式
    private String address;//地址
    private String people;//联系人

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Manufactor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", people='" + people + '\'' +
                '}';
    }
}
