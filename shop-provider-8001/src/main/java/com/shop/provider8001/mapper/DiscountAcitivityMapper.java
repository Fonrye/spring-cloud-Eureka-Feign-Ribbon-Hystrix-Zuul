package com.shop.provider8001.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.api.entity.DiscountAcitivity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DiscountAcitivityMapper extends BaseMapper<DiscountAcitivity> {

	/**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */

	List<DiscountAcitivity> listAll(DiscountAcitivity discountAcitivity);

	/**
     * 根据主键查询
     *
     * @param activityId 主键
     * @return 返回记录，没有返回null
     */
	DiscountAcitivity getById(Integer activityId);
	

	/**
     * 新增，忽略null字段
     *
     * @param discountAcitivity 新增的记录
     * @return 返回影响行数
     */
	int insertIgnoreNull(DiscountAcitivity discountAcitivity);
	
	/**
     * 修改，修改所有字段
     *
     * @param discountAcitivity 修改的记录
     * @return 返回影响行数
     */
	int update(DiscountAcitivity discountAcitivity);
	
	/**
     * 修改，忽略null字段
     *
     * @param discountAcitivity 修改的记录
     * @return 返回影响行数
     */
	int updateIgnoreNull(DiscountAcitivity discountAcitivity);
	
	/**
     * 删除记录
     *
     * @param discountAcitivity 待删除的记录
     * @return 返回影响行数
     */
	int delete(DiscountAcitivity discountAcitivity);
	
}