package com.shop.provider8001.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.api.entity.ShopCat;
import com.shop.api.entity.ShopOrder;

import java.util.List;

public interface IShopOrderService extends IService<ShopOrder> {
    public ShopOrder getById(Integer userId);
    public int insertIgnoreNull(ShopOrder user);
    public int update(ShopOrder user);
    public int updateIgnoreNull(ShopOrder user);
    public int delete(ShopOrder user);
    public List<ShopOrder> listAll(ShopOrder user);

    ShopOrder buy(List<ShopCat> catList);
}
