package com.shop.provider8002.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.api.entity.Goods;
import com.shop.provider8002.mapper.GoodsMapper;
import com.shop.provider8002.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<Goods> listAll(Goods goods){
    	return goodsMapper.listAll(goods);
    }


    /**
     * 根据主键查询
     *
     * @param goodsId 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public Goods getById(Integer goodsId) {
    	return goodsMapper.getById(goodsId);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param goods 新增的记录
     * @return 返回影响行数
     */
    public int insert(Goods goods) {
    	return goodsMapper.insert(goods);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param goods 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(Goods goods) {
    	return goodsMapper.insertIgnoreNull(goods);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param goods 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(Goods goods) {
    	return goodsMapper.update(goods);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param goods 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(Goods goods) {
    	return goodsMapper.updateIgnoreNull(goods);
    }
	
    /**
     * 删除记录
     *
     * @param goods 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(Goods goods) {
    	return goodsMapper.delete(goods);
    }
	
}