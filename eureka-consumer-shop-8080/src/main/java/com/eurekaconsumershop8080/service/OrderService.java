package com.eurekaconsumershop8080.service;


import com.eurekaconsumershop8080.config.HystrixConfig;
import com.eurekaconsumershop8080.service.impl.OrderServiceImpl;
import com.shop.api.entity.ShopCat;
import com.shop.api.entity.ShopOrder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "EUREKA-PROVIDER",configuration = HystrixConfig.class,fallback = OrderServiceImpl.class)
public interface OrderService {


    @PostMapping("/ShopOrder/buy")
    ShopOrder buy(@RequestBody List<ShopCat> catList);

    @PostMapping("/ShopOrder/updateIgnoreNull")
    boolean payOrder(@RequestBody ShopOrder order);

    @GetMapping("/ShopOrder/list")
    List<ShopOrder> list(@SpringQueryMap ShopOrder order);
}
