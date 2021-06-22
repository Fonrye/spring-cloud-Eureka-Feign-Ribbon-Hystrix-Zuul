package com.shop.provider8002.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.api.entity.DiscountAcitivity;

import java.util.List;

public interface IDiscountAcitivityService extends IService<DiscountAcitivity> {
    public DiscountAcitivity getById(Integer userId);
    public int insertIgnoreNull(DiscountAcitivity user);
    public int update(DiscountAcitivity user);
    public int updateIgnoreNull(DiscountAcitivity user);
    public int delete(DiscountAcitivity user);
    public List<DiscountAcitivity> listAll(DiscountAcitivity user);

}
