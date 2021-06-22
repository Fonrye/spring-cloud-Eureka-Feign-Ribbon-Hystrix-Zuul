package com.shop.consumer8085.controller;

import com.shop.api.entity.GoodsActivity;
import com.shop.consumer8085.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2021/6/15 16:01
 **/
@RestController
@RequestMapping("api/GoodsActivity")
public class ActivityController {

    @Autowired
    private ActivityService activityService;


    @GetMapping("toList")
    public String toList(ModelMap model, GoodsActivity activity) {
        List<GoodsActivity> list = activityService.list(activity);
        model.put("goodsActivityList", list);
        return "goodsActivity/list";
    }
    @GetMapping("toAdd")
    public String toAdd(Model model) {
        return "GoodsActivity/add";
    }

    @PostMapping("add")
    public String add(GoodsActivity activity) {
        activityService.add(activity);
        return "redirect:/api/GoodsActivity/toList";
    }

    @GetMapping(value = "/del/{activityId}")
    public String del(@PathVariable Integer activityId) {
        activityService.del(activityId);
        return "redirect:/api/GoodsActivity/toList";
    }

    @PostMapping("/update")
    public String update(GoodsActivity activity) {
        activityService.update(activity);
        return "redirect:/api/GoodsActivity/toList";
    }


}
