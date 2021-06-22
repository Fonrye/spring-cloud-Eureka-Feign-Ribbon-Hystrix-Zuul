package com.shop.provider8001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.api.entity.Goods;
import com.shop.api.entity.OrderGoods;
import com.shop.api.entity.ShopCat;
import com.shop.api.entity.ShopOrder;
import com.shop.provider8001.mapper.ShopOrderMapper;
import com.shop.provider8001.service.IOrderGoodsService;
import com.shop.provider8001.service.IShopCatService;
import com.shop.provider8001.service.IShopOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ShopOrderServiceImpl extends ServiceImpl<ShopOrderMapper, ShopOrder> implements IShopOrderService {

    @Autowired
    private ShopOrderMapper shopOrderMapper;
    @Autowired
    private IOrderGoodsService orderGoodsService;
    @Autowired
    private IShopCatService shopCatService;
    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<ShopOrder> listAll(ShopOrder shopOrder){
    	return shopOrderMapper.listAll(shopOrder);
    }

    /**
     * 事务回滚
     */
    @Transactional(rollbackFor = Exception.class)
    @Override
    public ShopOrder buy(List<ShopCat> catList) {
        // 生成订单
        ShopOrder shopOrder = new ShopOrder();
        BigDecimal fee = new BigDecimal(0);
        Integer orderId = shopOrder.getOrderId();
        // 用户id设置
        shopOrder.setOuid(catList.get(0).getUid());
        for (int i = 0; i < catList.size(); i++) {
            ShopCat cat = catList.get(i);
            Goods goods = cat.getGoods();
            // 订单商品保存
            OrderGoods orderGoods = new OrderGoods(orderId,goods.getGoodsId(),goods.getPrice(),goods.getName());
            orderGoodsService.insertIgnoreNull(orderGoods);
            // 进入累加
            fee.add(new BigDecimal(String.valueOf(goods.getPrice().multiply(new BigDecimal(cat.getGnum())))));
            // 移除购物车列表
            if(cat.getShopCatId()!=null){
                shopCatService.delete(cat);
            }
        }
        shopOrder.setFee(fee);
        // 订单信息·保存
        shopOrderMapper.insertIgnoreNull(shopOrder);
        return shopOrder;
    }


    /**
     * 根据主键查询
     *
     * @param orderId 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public ShopOrder getById(Integer orderId) {
    	return shopOrderMapper.getById(orderId);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param shopOrder 新增的记录
     * @return 返回影响行数
     */
    public int insert(ShopOrder shopOrder) {
    	return shopOrderMapper.insert(shopOrder);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param shopOrder 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(ShopOrder shopOrder) {
    	return shopOrderMapper.insertIgnoreNull(shopOrder);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param shopOrder 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(ShopOrder shopOrder) {
    	return shopOrderMapper.update(shopOrder);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param shopOrder 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(ShopOrder shopOrder) {
    	return shopOrderMapper.updateIgnoreNull(shopOrder);
    }
	
    /**
     * 删除记录
     *
     * @param shopOrder 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(ShopOrder shopOrder) {
    	return shopOrderMapper.delete(shopOrder);
    }
	
}