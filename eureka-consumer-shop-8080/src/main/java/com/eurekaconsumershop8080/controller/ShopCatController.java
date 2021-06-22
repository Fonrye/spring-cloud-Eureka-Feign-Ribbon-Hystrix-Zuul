package com.eurekaconsumershop8080.controller;

import com.eurekaconsumershop8080.service.ShopCatService;
import com.shop.api.entity.ShopCat;
import com.shop.api.entity.User;
import com.shop.api.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2021/6/13  16:20
 **/
@RestController
@RequestMapping("api/shop/cat")
public class ShopCatController {

    @Autowired
    private ShopCatService shopCatService;

    @GetMapping("add")
    public R add(ShopCat cat){
        boolean add = shopCatService.add(cat);
        return add ? new R().ok() : new R().error();
    }

    @GetMapping("list")
    public R list(ShopCat shopCat){
        List<ShopCat> list = shopCatService.list(shopCat);
        return new R().setData(list);
    }

    @GetMapping("remove")
    public R remove(ShopCat shopCat){
        boolean del = shopCatService.del(shopCat);
        return del ? new R().ok() : new R().error();
    }

    @PostMapping("/update")
    public R update(@RequestBody ShopCat shopCat){
        boolean update = shopCatService.update(shopCat);
        return new R().ok();
    }



}
