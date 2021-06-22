package com.shop.provider8002.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.api.entity.OrderGoods;
import com.shop.provider8002.mapper.OrderGoodsMapper;
import com.shop.provider8002.service.IOrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderGoodsServiceImpl  extends ServiceImpl<OrderGoodsMapper, OrderGoods> implements IOrderGoodsService {

    @Autowired
    private OrderGoodsMapper orderGoodsMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<OrderGoods> listAll(OrderGoods orderGoods){
    	return orderGoodsMapper.listAll(orderGoods);
    }


    /**
     * 根据主键查询
     *
     * @param ogId 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public OrderGoods getById(Integer ogId) {
    	return orderGoodsMapper.getById(ogId);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param orderGoods 新增的记录
     * @return 返回影响行数
     */
    public int insert(OrderGoods orderGoods) {
    	return orderGoodsMapper.insert(orderGoods);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param orderGoods 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(OrderGoods orderGoods) {
    	return orderGoodsMapper.insertIgnoreNull(orderGoods);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param orderGoods 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(OrderGoods orderGoods) {
    	return orderGoodsMapper.update(orderGoods);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param orderGoods 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(OrderGoods orderGoods) {
    	return orderGoodsMapper.updateIgnoreNull(orderGoods);
    }
	
    /**
     * 删除记录
     *
     * @param orderGoods 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(OrderGoods orderGoods) {
    	return orderGoodsMapper.delete(orderGoods);
    }
	
}