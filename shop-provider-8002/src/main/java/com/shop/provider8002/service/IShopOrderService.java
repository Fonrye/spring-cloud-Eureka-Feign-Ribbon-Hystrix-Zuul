package com.shop.provider8002.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.api.entity.ShopCat;
import com.shop.api.entity.ShopOrder;

import java.util.List;

public interface IShopOrderService extends IService<ShopOrder> {
    ShopOrder getById(Integer userId);

    int insertIgnoreNull(ShopOrder user);

    int update(ShopOrder user);

    int updateIgnoreNull(ShopOrder user);

    int delete(ShopOrder user);

    List<ShopOrder> listAll(ShopOrder user);

    ShopOrder buy(List<ShopCat> catList);
}
