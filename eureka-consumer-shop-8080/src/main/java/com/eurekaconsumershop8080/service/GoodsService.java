package com.eurekaconsumershop8080.service;

import com.eurekaconsumershop8080.config.HystrixConfig;
import com.eurekaconsumershop8080.service.impl.GoodsServiceImpl;
import com.shop.api.entity.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

@FeignClient(name = "EUREKA-PROVIDER",configuration = HystrixConfig.class,fallback = GoodsServiceImpl.class)
public interface GoodsService {

    @GetMapping(value = "Goods/list")
    List<Goods> list(@SpringQueryMap Goods goods);

    @PostMapping(value = "Goods/insertIgnore",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    boolean add(@RequestParam String name,
               @RequestParam BigDecimal privce,
               @RequestParam String describ,
               @RequestParam String classify, @RequestPart("file") MultipartFile file);

    @GetMapping(value = "Goods/getById/{goodsId}")
    Goods getById(@RequestParam Integer goodsId);

    // 删除
    @GetMapping(value = "Goods/delete/{goodsId}")
    boolean del(@RequestParam Integer goodsId);

    @PostMapping(value = "Goods/updateIgnoreNull")
    boolean update(@RequestBody Goods goods);
}
