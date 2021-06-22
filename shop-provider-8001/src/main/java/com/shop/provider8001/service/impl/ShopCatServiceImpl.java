package com.shop.provider8001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.api.entity.ShopCat;
import com.shop.provider8001.mapper.ShopCatMapper;
import com.shop.provider8001.service.IShopCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCatServiceImpl extends ServiceImpl<ShopCatMapper, ShopCat> implements IShopCatService {

    @Autowired
    private ShopCatMapper shopCatMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<ShopCat> listAll(ShopCat shopCat){
    	return shopCatMapper.listAll(shopCat);
    }


    /**
     * 根据主键查询
     *
     * @param shopCatId 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public ShopCat getById(Integer shopCatId) {
    	return shopCatMapper.getById(shopCatId);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param shopCat 新增的记录
     * @return 返回影响行数
     */
    public int insert(ShopCat shopCat) {
    	return shopCatMapper.insert(shopCat);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param shopCat 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(ShopCat shopCat) {
    	return shopCatMapper.insertIgnoreNull(shopCat);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param shopCat 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(ShopCat shopCat) {
    	return shopCatMapper.update(shopCat);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param shopCat 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(ShopCat shopCat) {
    	return shopCatMapper.updateIgnoreNull(shopCat);
    }
	
    /**
     * 删除记录
     *
     * @param shopCat 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(ShopCat shopCat) {
    	return shopCatMapper.delete(shopCat);
    }
	
}