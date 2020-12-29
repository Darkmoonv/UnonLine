package com.zs.ssm.controller;

import com.zs.ssm.domain.*;
import com.zs.ssm.service.DingDanService;
import com.zs.ssm.service.OredrsService;
import com.zs.ssm.utils.ResultPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OredrsService oredrsService;
    @Autowired
    private DingDanService danService;
    @RequestMapping("/showOrders.do")
    public ModelAndView showOrders(){
        List<Orders> ordersList=oredrsService.showOrders();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject(ResultPool.SHOW_ORDERS_LIST,ordersList);
        modelAndView.setViewName("/ordersShow");
        return modelAndView;
    }

    @RequestMapping("/car.do")
    public ModelAndView Car(@RequestParam("ordres") Orders orders,@RequestParam("user") User user,HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        CarItem carItem=new CarItem();
        Orders CarOrders=oredrsService.find(orders);
        String id=String.valueOf(CarOrders.getId());
        HashMap<Integer,Orders> map=(HashMap)carItem.getMap();
        HttpSession Session=request.getSession();
        Session.setAttribute("carItems",map);
        modelAndView.setViewName("showCar");
        return modelAndView;
    }

    @RequestMapping("/buy.do")
    public ModelAndView buyOrders(@RequestParam("orders") Orders orders, @RequestParam("username") User user){
        ModelAndView modelAndView=new ModelAndView();

        Orders buyOrders=oredrsService.find(orders);
        return modelAndView;
    }
}
