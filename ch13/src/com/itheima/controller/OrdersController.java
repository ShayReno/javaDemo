package com.itheima.controller;

import com.itheima.po.Orders;
import com.itheima.po.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrdersController {

    @RequestMapping("/tofindOrdersWithUser")
    public String tofindOrdersWithUser(){
        return "orders";
    }

    @RequestMapping("/findOrdersWithUser")
    public String findOrdersWithUser(Orders orders) {
        int orderid= orders.getOrdersid();
        User user =orders.getUser();
        String username=user.getUsername();
        System.out.println("ordersid:"+orderid);
        System.out.println("username"+username);
        return  "first";
    }
}
