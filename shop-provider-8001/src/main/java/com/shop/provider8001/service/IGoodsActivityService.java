package com.shop.provider8001.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.api.entity.GoodsActivity;

import java.util.List;

public interface IGoodsActivityService extends IService<GoodsActivity> {

    public GoodsActivity getById(Integer userId);
    public int insertIgnoreNull(GoodsActivity user);
    public int update(GoodsActivity user);
    public int updateIgnoreNull(GoodsActivity user);
    public int delete(GoodsActivity user);
    public List<GoodsActivity> listAll(GoodsActivity user);
}
