package com.shop.provider8002.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.api.entity.GoodsActivity;
import com.shop.provider8002.mapper.GoodsActivityMapper;
import com.shop.provider8002.service.IGoodsActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsActivityServiceImpl extends ServiceImpl<GoodsActivityMapper, GoodsActivity> implements IGoodsActivityService {

    @Autowired
    private GoodsActivityMapper goodsActivityMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<GoodsActivity> listAll(GoodsActivity goodsActivity){
    	return goodsActivityMapper.listAll(goodsActivity);
    }


    /**
     * 根据主键查询
     *
     * @param gaId 主键
     * @return 返回记录，没有返回null
     */

    @Override
    public GoodsActivity getById(Integer gaId) {
    	return goodsActivityMapper.getById(gaId);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param goodsActivity 新增的记录
     * @return 返回影响行数
     */

    public int insert(GoodsActivity goodsActivity) {
    	return goodsActivityMapper.insert(goodsActivity);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param goodsActivity 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(GoodsActivity goodsActivity) {
    	return goodsActivityMapper.insertIgnoreNull(goodsActivity);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param goodsActivity 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(GoodsActivity goodsActivity) {
    	return goodsActivityMapper.update(goodsActivity);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param goodsActivity 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(GoodsActivity goodsActivity) {
    	return goodsActivityMapper.updateIgnoreNull(goodsActivity);
    }
	
    /**
     * 删除记录
     *
     * @param goodsActivity 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(GoodsActivity goodsActivity) {
    	return goodsActivityMapper.delete(goodsActivity);
    }
	
}