package com.zs.ssm.domain;

import java.util.List;

public class Orders {
    //货物表
    private int id;
    private String g_name;
    private int price;
    private int total;
    private String describe;
    private int sumPrice;

    private List<User> userList;
    public Orders() {
    }


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public int getSumPrice() {
        return sumPrice;
    }

    public void setSumPrice(int sumPrice) {
        this.sumPrice = sumPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getG_name() {
        return g_name;
    }

    public void setG_name(String g_name) {
        this.g_name = g_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", g_name='" + g_name + '\'' +
                ", price=" + price +
                ", total=" + total +
                ", describe='" + describe + '\'' +
                ", sumPrice=" + sumPrice +
                ", userList=" + userList +
                '}';
    }
}
