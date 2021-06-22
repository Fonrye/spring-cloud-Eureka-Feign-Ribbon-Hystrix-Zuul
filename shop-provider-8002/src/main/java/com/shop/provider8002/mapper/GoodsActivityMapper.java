package com.shop.provider8002.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.api.entity.GoodsActivity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsActivityMapper extends BaseMapper<GoodsActivity> {

	/**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
	List<GoodsActivity> listAll(GoodsActivity goodsActivity);


	/**
     * 根据主键查询
     *
     * @param gaId 主键
     * @return 返回记录，没有返回null
     */
	GoodsActivity getById(Integer gaId);
	
	/**
     * 新增，忽略null字段
     *
     * @param goodsActivity 新增的记录
     * @return 返回影响行数
     */
	int insertIgnoreNull(GoodsActivity goodsActivity);
	
	/**
     * 修改，修改所有字段
     *
     * @param goodsActivity 修改的记录
     * @return 返回影响行数
     */
	int update(GoodsActivity goodsActivity);
	
	/**
     * 修改，忽略null字段
     *
     * @param goodsActivity 修改的记录
     * @return 返回影响行数
     */
	int updateIgnoreNull(GoodsActivity goodsActivity);
	
	/**
     * 删除记录
     *
     * @param goodsActivity 待删除的记录
     * @return 返回影响行数
     */
	int delete(GoodsActivity goodsActivity);
	
}