package com.shop.provider8002.controller;

import com.shop.api.entity.ShopCat;
import com.shop.provider8002.service.IShopCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("ShopCat")
public class ShopCatController {

    @Autowired
    private IShopCatService shopCatService;

	private static final String INDEX_PAGE = "admin/admin-shopCat";
    private static final String EDIT_PAGE = "shopCat/edit";

    



    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<ShopCat> listAll( ShopCat shopCat) {
        return shopCatService.listAll(shopCat);
    }

    /**
     * 根据主键查询
     *
     * @param  shopCatId 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public ShopCat getById(Integer shopCatId) {
        return shopCatService.getById(shopCatId);
    }


    /**
     * 新增，忽略null字段
     *
     * @param shopCat 新增的记录
     * @return 返回影响行数
     */
    @GetMapping("insertIgnore")
    public boolean insertIgnoreNull( ShopCat shopCat) {
        return shopCatService.insertIgnoreNull(shopCat)>0;
    }


    /**
     * 修改，忽略null字段
     *
     * @param shopCat 修改的记录
     * @return 返回影响行数
     */
    @PostMapping("updateIgnoreNull")
    public boolean updateIgnoreNull(@RequestBody ShopCat shopCat) {
        return  shopCatService.updateIgnoreNull(shopCat)>0;
    }

    /**
     * 删除记录
     *
     * @param shopCat
     * @return 返回影响行数
     */
    @GetMapping("delete")
    public boolean delete(ShopCat shopCat) {
        if(shopCat.getShopCatId()==null) {
            return false;
        }
        return  shopCatService.delete(shopCat)>0;
    }
    
}