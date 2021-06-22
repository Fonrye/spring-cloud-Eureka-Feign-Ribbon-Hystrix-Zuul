package com.shop.consumer8085.service;

import com.shop.api.entity.Goods;
import com.shop.consumer8085.config.HystrixConfig;
import com.shop.consumer8085.service.impl.GoodsServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

@FeignClient(name = "EUREKA-PROVIDER",configuration = HystrixConfig.class,fallback = GoodsServiceImpl.class)
public interface GoodsService {

    @GetMapping(value = "Goods/list")
    List<Goods>  list(Goods goods);

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
