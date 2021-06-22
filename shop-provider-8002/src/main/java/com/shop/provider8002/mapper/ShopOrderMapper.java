package com.shop.provider8002.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.api.entity.ShopOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopOrderMapper extends BaseMapper<ShopOrder> {

	/**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
	List<ShopOrder> listAll(ShopOrder shopOrder);


	/**
     * 根据主键查询
     *
     * @param orderId 主键
     * @return 返回记录，没有返回null
     */
	ShopOrder getById(Integer orderId);
	

	/**
     * 新增，忽略null字段
     *
     * @param shopOrder 新增的记录
     * @return 返回影响行数
     */
	int insertIgnoreNull(ShopOrder shopOrder);
	
	/**
     * 修改，修改所有字段
     *
     * @param shopOrder 修改的记录
     * @return 返回影响行数
     */
	int update(ShopOrder shopOrder);
	
	/**
     * 修改，忽略null字段
     *
     * @param shopOrder 修改的记录
     * @return 返回影响行数
     */
	int updateIgnoreNull(ShopOrder shopOrder);
	
	/**
     * 删除记录
     *
     * @param shopOrder 待删除的记录
     * @return 返回影响行数
     */
	int delete(ShopOrder shopOrder);
	
}