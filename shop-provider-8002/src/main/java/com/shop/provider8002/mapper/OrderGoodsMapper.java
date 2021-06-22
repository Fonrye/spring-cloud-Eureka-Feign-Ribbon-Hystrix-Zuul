package com.shop.provider8002.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.api.entity.OrderGoods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderGoodsMapper extends BaseMapper<OrderGoods> {

	/**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
	List<OrderGoods> listAll(OrderGoods orderGoods);


	/**
     * 根据主键查询
     *
     * @param ogId 主键
     * @return 返回记录，没有返回null
     */
	OrderGoods getById(Integer ogId);
	
	/**
     * 新增，忽略null字段
     *
     * @param orderGoods 新增的记录
     * @return 返回影响行数
     */
	int insertIgnoreNull(OrderGoods orderGoods);
	
	/**
     * 修改，修改所有字段
     *
     * @param orderGoods 修改的记录
     * @return 返回影响行数
     */
	int update(OrderGoods orderGoods);
	
	/**
     * 修改，忽略null字段
     *
     * @param orderGoods 修改的记录
     * @return 返回影响行数
     */
	int updateIgnoreNull(OrderGoods orderGoods);
	
	/**
     * 删除记录
     *
     * @param orderGoods 待删除的记录
     * @return 返回影响行数
     */
	int delete(OrderGoods orderGoods);
	
}