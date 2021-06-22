package com.shop.provider8002.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.api.entity.ShopCat;

import java.util.List;

public interface IShopCatService extends IService<ShopCat> {

    public ShopCat getById(Integer userId);
    public int insertIgnoreNull(ShopCat user);
    public int update(ShopCat user);
    public int updateIgnoreNull(ShopCat user);
    public int delete(ShopCat user);
    public List<ShopCat> listAll(ShopCat user);
}
