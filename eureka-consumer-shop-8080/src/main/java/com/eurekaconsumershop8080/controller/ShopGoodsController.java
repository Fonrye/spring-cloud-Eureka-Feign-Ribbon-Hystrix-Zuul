package com.eurekaconsumershop8080.controller;

import com.eurekaconsumershop8080.service.GoodsService;
import com.shop.api.entity.Goods;
import com.shop.api.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2021/6/11 11:40
 **/
@RestController
@RequestMapping("/api/shop")
public class ShopGoodsController {

    @Autowired
    private GoodsService goodsService;


    @GetMapping("/goods")
    public R queryGoods(Goods goods){
        List<Goods> list = goodsService.list(goods);
        return new R().ok().setData(list);
    }


}
