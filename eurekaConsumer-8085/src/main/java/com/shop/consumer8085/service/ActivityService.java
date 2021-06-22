package com.shop.consumer8085.service;

import com.shop.api.entity.GoodsActivity;
import com.shop.consumer8085.config.HystrixConfig;
import com.shop.consumer8085.service.impl.ActivityServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

@FeignClient(name = "EUREKA-PROVIDER",configuration = HystrixConfig.class,fallback = ActivityServiceImpl.class)
public interface ActivityService {


    @GetMapping(value = "GoodsActivity/list")
    List<GoodsActivity> list(GoodsActivity activity);

    @PostMapping("GoodsActivity/insertIgnore")
    boolean add(@RequestBody GoodsActivity activity);

    @GetMapping(value = "GoodsActivity/delete/{activityId}")
    boolean del(@PathVariable Integer activityId);

    @PostMapping(value = "GoodsActivity/updateIgnoreNull")
    boolean update(@RequestBody GoodsActivity activity);


}
