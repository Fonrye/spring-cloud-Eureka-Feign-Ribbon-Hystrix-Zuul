package com.shop.provider8001.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.api.entity.OrderGoods;

import java.util.List;

public interface IOrderGoodsService extends IService<OrderGoods> {
    public OrderGoods getById(Integer userId);
    public int insertIgnoreNull(OrderGoods user);
    public int update(OrderGoods user);
    public int updateIgnoreNull(OrderGoods user);
    public int delete(OrderGoods user);
    public List<OrderGoods> listAll(OrderGoods user);
}
