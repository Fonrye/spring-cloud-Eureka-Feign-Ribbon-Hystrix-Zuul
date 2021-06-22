package com.shop.provider8001.controller;

import com.shop.api.entity.ShopCat;
import com.shop.api.entity.ShopOrder;
import com.shop.provider8001.service.IOrderGoodsService;
import com.shop.provider8001.service.IShopCatService;
import com.shop.provider8001.service.IShopOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("ShopOrder")
public class ShopOrderController {

    @Autowired
    private IShopOrderService shopOrderService;
    @Autowired
    private IOrderGoodsService orderGoodsService;
    @Autowired
    private IShopCatService shopCatService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<ShopOrder> listAll(ShopOrder shopOrder,Model model) {
         return shopOrderService.listAll(shopOrder);
    }

    @PostMapping("buy")
    public ShopOrder buy(@RequestBody List<ShopCat> catList){
        ShopOrder buy = shopOrderService.buy(catList);
        System.out.println(buy);
        return buy;
    }

    /**
     * 根据主键查询
     *
     * @param  orderId 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public ShopOrder getById(Integer orderId) {
        return shopOrderService.getById(orderId);
    }
    

    /**
     * 新增，忽略null字段
     *
     * @param shopOrder 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insertIgnore")
    public boolean insertIgnoreNull(ShopOrder shopOrder) {
         return shopOrderService.insertIgnoreNull(shopOrder)>0;
    }
    

    /**
     * 修改，忽略null字段
     *
     * @param shopOrder 修改的记录
     * @return 返回影响行数
     */
    @PostMapping("updateIgnoreNull")
    @ResponseBody
    public boolean updateIgnoreNull(@RequestBody ShopOrder shopOrder) {
         return shopOrderService.updateIgnoreNull(shopOrder)>0;
    }

    /**
     * 删除记录
     *
     * @param shopOrder 待删除的记录
     * @return 返回影响行数
     */
    @GetMapping("delete")
    public boolean delete(ShopOrder shopOrder) {
        shopOrderService.delete(shopOrder);
        return shopOrderService.delete(shopOrder)>0;
    }
    
}