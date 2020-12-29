package com.zs.ssm.domain;

import java.util.List;

//用户表
public class User {
    private int id;
    private String name;
    private String username;
    private String password;
    private String admin;
    private List<Orders> ordersList;
    private List<Role> roleList;
    public User() {
    }

    public User(int id, String name, String username, String password, String admin, List<Orders> ordersList, List<Role> roleList) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.password = password;
        this.admin = admin;
        this.ordersList = ordersList;
        this.roleList = roleList;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", ordersList=" + ordersList +
                ", roleList=" + roleList +
                '}';
    }
}
