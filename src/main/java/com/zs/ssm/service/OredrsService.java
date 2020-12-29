package com.zs.ssm.service;

import com.zs.ssm.domain.Orders;
import com.zs.ssm.domain.User;

import java.util.List;

public interface OredrsService extends BaseService<Orders> {
    public List<Orders> showOrders();

    void add(Orders orders);

    void del(Orders orders);

    void replace(Orders orders);

    Orders find(Orders orders);

    public Integer buyOrders(Integer num,int id);
}
