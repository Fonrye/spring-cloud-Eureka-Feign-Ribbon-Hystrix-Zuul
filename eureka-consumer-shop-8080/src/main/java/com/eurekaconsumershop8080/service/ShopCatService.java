package com.eurekaconsumershop8080.service;

import com.eurekaconsumershop8080.config.HystrixConfig;
import com.eurekaconsumershop8080.service.impl.ShopCatServiceImpl;
import com.shop.api.entity.ShopCat;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "EUREKA-PROVIDER",
configuration = HystrixConfig.class,
fallback = ShopCatServiceImpl.class)
public interface ShopCatService {


    @GetMapping(value = "/ShopCat/insertIgnore")
     boolean add(@SpringQueryMap ShopCat shopCat);

    @GetMapping(value = "/ShopCat/list")
    List<ShopCat> list(@SpringQueryMap ShopCat shopCat);

    @GetMapping("/ShopCat/delete")
    boolean del(@SpringQueryMap ShopCat shopCat);

    @PostMapping("/ShopCat/updateIgnoreNull")
    boolean update(@RequestBody ShopCat shopCat);
}
