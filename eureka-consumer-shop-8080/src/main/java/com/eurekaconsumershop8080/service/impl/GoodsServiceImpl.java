package com.eurekaconsumershop8080.service.impl;

import com.eurekaconsumershop8080.service.GoodsService;
import com.shop.api.entity.Goods;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.List;

@Component
public class GoodsServiceImpl implements GoodsService {
    @Override
    public List<Goods> list(Goods goods) {
        return null;
    }

    @Override
    public boolean add(String name, BigDecimal privce, String describ, String classify, MultipartFile file) {
        return false;
    }

    @Override
    public Goods getById(Integer goodsId) {
        return null;
    }

    @Override
    public boolean del(Integer goodsId) {
        return false;
    }

    @Override
    public boolean update(Goods goods) {
        return false;
    }
}
