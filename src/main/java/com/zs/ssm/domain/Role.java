package com.zs.ssm.domain;

public class Role {
    private int id;
    private String role_name;
    public Role() {
    }

    public Role(int id, String role_name) {
        this.id = id;
        this.role_name = role_name;
    }

    public int getId() {
        if (id==1){
            role_name="管理员";
        }else if (id==2){
            role_name="普通用户";
        }else if (id==3){
            role_name="游客";
        }
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}
