package com.shop.provider8002.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.api.entity.Goods;

import java.util.List;

public interface IGoodsService extends IService<Goods> {

    public Goods getById(Integer userId);
    public int insertIgnoreNull(Goods user);
    public int update(Goods user);
    public int updateIgnoreNull(Goods user);
    public int delete(Goods user);
    public List<Goods> listAll(Goods user);

}
