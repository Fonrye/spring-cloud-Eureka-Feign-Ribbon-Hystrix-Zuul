package com.eurekaconsumershop8080.service.impl;

import com.eurekaconsumershop8080.service.ShopCatService;
import com.shop.api.entity.ShopCat;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ShopCatServiceImpl implements ShopCatService {
    @Override
    public boolean add(ShopCat shopCat) {
        return false;
    }

    @Override
    public List<ShopCat> list(ShopCat shopCat) {
        return null;
    }

    @Override
    public boolean del(ShopCat shopCat) {
        return false;
    }

    @Override
    public boolean update(ShopCat shopCat) {
        return false;
    }
}
