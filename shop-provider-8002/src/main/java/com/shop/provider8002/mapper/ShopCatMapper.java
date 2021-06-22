package com.shop.provider8002.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shop.api.entity.ShopCat;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopCatMapper extends BaseMapper<ShopCat> {

	/**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
	List<ShopCat> listAll(ShopCat shopCat);


	/**
     * 根据主键查询
     *
     * @param shopCatId 主键
     * @return 返回记录，没有返回null
     */
	ShopCat getById(Integer shopCatId);
	
	/**
     * 新增，忽略null字段
     *
     * @param shopCat 新增的记录
     * @return 返回影响行数
     */
	int insertIgnoreNull(ShopCat shopCat);
	
	/**
     * 修改，修改所有字段
     *
     * @param shopCat 修改的记录
     * @return 返回影响行数
     */
	int update(ShopCat shopCat);
	
	/**
     * 修改，忽略null字段
     *
     * @param shopCat 修改的记录
     * @return 返回影响行数
     */
	int updateIgnoreNull(ShopCat shopCat);
	
	/**
     * 删除记录
     *
     * @param shopCat 待删除的记录
     * @return 返回影响行数
     */
	int delete(ShopCat shopCat);
	
}