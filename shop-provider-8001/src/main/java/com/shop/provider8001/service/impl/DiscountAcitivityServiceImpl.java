package com.shop.provider8001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.api.entity.DiscountAcitivity;
import com.shop.provider8001.mapper.DiscountAcitivityMapper;
import com.shop.provider8001.service.IDiscountAcitivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountAcitivityServiceImpl
        extends ServiceImpl<DiscountAcitivityMapper, DiscountAcitivity> implements IDiscountAcitivityService {

    @Autowired
    private DiscountAcitivityMapper discountAcitivityMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<DiscountAcitivity> listAll(DiscountAcitivity discountAcitivity){
    	return discountAcitivityMapper.listAll(discountAcitivity);
    }


    /**
     * 根据主键查询
     *
     * @param activityId 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public DiscountAcitivity getById(Integer activityId) {
    	return discountAcitivityMapper.getById(activityId);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param discountAcitivity 新增的记录
     * @return 返回影响行数
     */
    public int insert(DiscountAcitivity discountAcitivity) {
    	return discountAcitivityMapper.insert(discountAcitivity);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param discountAcitivity 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(DiscountAcitivity discountAcitivity) {
    	return discountAcitivityMapper.insertIgnoreNull(discountAcitivity);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param discountAcitivity 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(DiscountAcitivity discountAcitivity) {
    	return discountAcitivityMapper.update(discountAcitivity);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param discountAcitivity 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(DiscountAcitivity discountAcitivity) {
    	return discountAcitivityMapper.updateIgnoreNull(discountAcitivity);
    }
	
    /**
     * 删除记录
     *
     * @param discountAcitivity 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(DiscountAcitivity discountAcitivity) {
    	return discountAcitivityMapper.delete(discountAcitivity);
    }
	
}