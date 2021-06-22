package com.shop.consumer8085.service.impl;

import com.shop.api.entity.Goods;
import com.shop.consumer8085.service.GoodsService;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class GoodsServiceImpl implements GoodsService {
    @Override
    public List<Goods> list(Goods goods) {
        ArrayList<Goods> goodsList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            goodsList.add(new Goods("Hystrix熔断...",new BigDecimal(-1234),"熔断....","hystrix熔断"));
        }
        return goodsList;
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
