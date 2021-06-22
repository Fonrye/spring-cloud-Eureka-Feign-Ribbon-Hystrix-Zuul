package com.eurekaconsumershop8080.controller;

import com.eurekaconsumershop8080.service.OrderService;
import com.shop.api.entity.ShopCat;
import com.shop.api.entity.ShopOrder;
import com.shop.api.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2021/6/13 14:40
 **/
@RestController
@RequestMapping("api/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @GetMapping("list")
    public R muOrders(ShopOrder order){
        List<ShopOrder> orders = orderService.list(order);
        return  new R().ok().setData(orders);

    }

    @PostMapping("buy")
    public R buy(@RequestBody List<ShopCat> catList){
        ShopOrder orders = orderService.buy(catList);
        return new R().ok().setData(orders);
    }

    @PostMapping("pay")
   public R payOrder(@RequestBody ShopOrder order){
        orderService.payOrder(order);
        return new R().ok();
    }

}
