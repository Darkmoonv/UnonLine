package com.zs.ssm.dao;
import com.zs.ssm.domain.Orders;
import java.util.List;

public interface OrdersMapper extends BaseMappper<Orders>{
    public List<Orders> findAllOrders();
    public Orders findId(int id);
}
