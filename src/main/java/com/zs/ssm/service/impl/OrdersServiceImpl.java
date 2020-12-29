package com.zs.ssm.service.impl;

import com.zs.ssm.dao.DingDanMapper;
import com.zs.ssm.dao.OrdersMapper;
import com.zs.ssm.domain.DingDan;
import com.zs.ssm.domain.Orders;
import com.zs.ssm.domain.User;
import com.zs.ssm.service.OredrsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("ordersService")
public class OrdersServiceImpl extends BaseServiceImpl<Orders> implements OredrsService {
    @Autowired
    private OrdersMapper ordersMapper;
    @Autowired
    private DingDanMapper danMapper;
    public List<Orders> showOrders() {
       List<Orders> ordersList= ordersMapper.findAllOrders();
       return ordersList;
    }

    public Integer buyOrders(Integer num,int id) {
        int sum=0;
        Orders buyOrder=ordersMapper.findId(id);
        buyOrder.setTotal(buyOrder.getTotal()-1);
        buyOrder.setSumPrice(buyOrder.getPrice()*num);
        ordersMapper.replace(buyOrder);
        sum+=buyOrder.getSumPrice();
        return sum;
    }
}
