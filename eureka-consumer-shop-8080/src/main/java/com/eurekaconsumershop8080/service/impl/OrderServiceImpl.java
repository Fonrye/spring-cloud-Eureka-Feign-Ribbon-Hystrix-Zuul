package com.eurekaconsumershop8080.service.impl;

import com.eurekaconsumershop8080.service.OrderService;
import com.shop.api.entity.ShopCat;
import com.shop.api.entity.ShopOrder;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class OrderServiceImpl implements OrderService {

    @Override
    public ShopOrder buy(List<ShopCat> catList) {
        return null;
    }

    @Override
    public boolean payOrder(ShopOrder order) {
        return false;
    }

    @Override
    public List<ShopOrder> list(ShopOrder order) {
        List<ShopOrder> orders = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            orders.add(new ShopOrder(-111,new BigDecimal(-111),-111,"hystrix熔断处理...",new Date()));
        }
        return orders;
    }
}
