package com.shop.provider8001.controller;

import com.shop.api.entity.GoodsActivity;
import com.shop.provider8001.service.IGoodsActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("GoodsActivity")
public class GoodsActivityController {

    @Autowired
    private IGoodsActivityService goodsActivityService;

    /**
     * 查询所有记录
     * @return 返回集合，没有返回空List
     */
    @GetMapping("list")
    public List<GoodsActivity> listAll( GoodsActivity goodsActivity,Model model) {
         return goodsActivityService.listAll(goodsActivity);
    }


    /**
     * 根据主键查询
     * @param  gaId 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public GoodsActivity getById(Integer gaId) {
        return goodsActivityService.getById(gaId);
    }


    /**
     * 新增，忽略null字段
     * @param goodsActivity 新增的记录
     * @return 返回影响行数
     */
    @PostMapping("insertIgnore")
    public boolean insertIgnoreNull(@RequestBody GoodsActivity goodsActivity) {
        return goodsActivityService.insertIgnoreNull(goodsActivity)>0;
    }
    

    /**
     * 修改，忽略null字段
     *
     * @param goodsActivity 修改的记录
     * @return 返回影响行数
     */
    @PostMapping("updateIgnoreNull")
    public boolean updateIgnoreNull(@RequestBody GoodsActivity goodsActivity) {
         return goodsActivityService.updateIgnoreNull(goodsActivity)>0;
    }
    
    /**
     * 删除记录
     *
     * @param activity 待删除的记录
     * @return 返回影响行数
     */
    @GetMapping("delete")
    public boolean delete(GoodsActivity activity) {
        return goodsActivityService.delete(activity) > 0;
    }
    
}