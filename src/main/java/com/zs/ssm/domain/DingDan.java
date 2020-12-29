package com.zs.ssm.domain;

import com.zs.ssm.utils.StringToDate;

import java.util.Date;
import java.util.List;

public class DingDan {
    private int id;
    private int user_id;
    private int orders_id;
    private int sum_price;
    private List<User> userList;
    private List<Orders> ordersList;
    private Date date;
    public DingDan() {
    }

    public int getSum_price() {
        return sum_price;
    }

    public void setSum_price(int sum_price) {
        this.sum_price = sum_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public String getDate() {
        if (date!=null){
            return StringToDate.dateToString(date,"yyyy-MM-dd HH-mm-ss");
        }
        return null;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "DingDan{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", orders_id=" + orders_id +
                ", userList=" + userList +
                ", ordersList=" + ordersList +
                ", date=" + date +
                '}';
    }
}
