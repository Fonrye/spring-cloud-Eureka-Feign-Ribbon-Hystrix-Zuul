package com.shop.provider8001.controller;

import com.shop.api.entity.OrderGoods;
import com.shop.provider8001.service.IOrderGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("OrderGoods")
public class OrderGoodsController {

    @Autowired
    private IOrderGoodsService orderGoodsService;

	private static final String INDEX_PAGE = "admin/admin-orderGoods";
    private static final String EDIT_PAGE = "orderGoods/edit";
    
    
    
    @RequestMapping("/toIndex")
    private String toIndex(Model model){
        List<OrderGoods> orderGoodsList = orderGoodsService.listAll(new OrderGoods());
        model.addAttribute("orderGoodsList", orderGoodsList);
        model.addAttribute("total", orderGoodsList.size());
        return INDEX_PAGE;
    }

    @RequestMapping("/toAdd")
    private String toAdd(Model model){
        model.addAttribute("btnType", "add");
        OrderGoods orderGoods = new OrderGoods();
        model.addAttribute("orderGoods",orderGoods);
        List<OrderGoods> orderGoodsList = orderGoodsService.listAll(new OrderGoods());
        model.addAttribute("orderGoodsOptions",orderGoodsList);
        return EDIT_PAGE;
    }

    @RequestMapping("/toEdit/{orderGoodsID}")
    private String toEdit(@PathVariable String orderGoodsID,Model model){
        model.addAttribute("btnType", "edit");
        OrderGoods orderGoods = orderGoodsService.getById(Integer.valueOf(orderGoodsID));
        model.addAttribute("orderGoods",orderGoods);
        List<OrderGoods> orderGoodsList = orderGoodsService.listAll(new OrderGoods());
        model.addAttribute("orderGoodsOptions",orderGoodsList);
        return EDIT_PAGE;
    }
    
    
    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public String listAll(OrderGoods orderGoods, Model model) {
         model.addAttribute("orderGoodsList",orderGoodsService.listAll(orderGoods));
         return INDEX_PAGE;
    }


    /**
     * 根据主键查询
     *
     * @param  ogId 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById")
    public OrderGoods getById(Integer ogId) {
        return orderGoodsService.getById(ogId);
    }
    

    /**
     * 新增，忽略null字段
     *
     * @param orderGoods 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insertIgnore")
    public String insertIgnoreNull(OrderGoods orderGoods) {
         orderGoodsService.insertIgnoreNull(orderGoods);
         return "redirect:/OrderGoods/toIndex";
    }
    
    /**
     * 修改，修改所有字段
     *
     * @param orderGoods 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public int update( OrderGoods orderGoods) {
        return orderGoodsService.update(orderGoods);
    }
    
    /**
     * 修改，忽略null字段
     *
     * @param orderGoods 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("updateIgnoreNull")
    public String updateIgnoreNull(OrderGoods orderGoods) {
         orderGoodsService.updateIgnoreNull(orderGoods);
         return "redirect:/OrderGoods/toIndex";
    }
    
    /**
     * 删除记录
     *
     * @param orderGoodsID 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete/{orderGoodsID}")
    public String delete(@PathVariable String orderGoodsID) {
     	OrderGoods orderGoods = new OrderGoods();
        orderGoodsService.delete(orderGoods);
        return "redirect:/OrderGoods/toIndex";
    }
    
}