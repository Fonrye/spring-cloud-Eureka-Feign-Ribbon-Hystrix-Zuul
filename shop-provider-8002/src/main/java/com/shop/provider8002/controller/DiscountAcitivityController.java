package com.shop.provider8002.controller;

import com.shop.provider8002.service.IDiscountAcitivityService;
import com.shop.api.entity.DiscountAcitivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("DiscountAcitivity")
public class DiscountAcitivityController {

    @Autowired
    private IDiscountAcitivityService discountAcitivityService;



    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<DiscountAcitivity> listAll( DiscountAcitivity discountAcitivity,Model model) {
         return discountAcitivityService.listAll(discountAcitivity);
    }


    /**
     * 根据主键查询
     *
     * @param  activityId 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public DiscountAcitivity getById(Integer activityId) {
        return discountAcitivityService.getById(activityId);
    }
    
    /**
     * 新增，忽略null字段
     *
     * @param discountAcitivity 新增的记录
     * @return 返回影响行数
     */
    @PostMapping("insertIgnore")
    public boolean insertIgnoreNull(@RequestBody DiscountAcitivity discountAcitivity) {
         return discountAcitivityService.insertIgnoreNull(discountAcitivity)>0;
    }

    /**
     * 修改，忽略null字段
     *
     * @param discountAcitivity 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("updateIgnoreNull")
    public boolean updateIgnoreNull(DiscountAcitivity discountAcitivity) {

         return discountAcitivityService.updateIgnoreNull(discountAcitivity)>0;
    }
    
    /**
     * 删除记录
     *
     * @param acitivity 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete")
    public boolean delete(DiscountAcitivity acitivity) {
        return  discountAcitivityService.delete(acitivity)>0;
    }
    
}