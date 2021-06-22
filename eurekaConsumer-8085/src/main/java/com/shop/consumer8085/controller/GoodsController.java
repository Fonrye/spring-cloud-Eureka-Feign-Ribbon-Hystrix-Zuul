package com.shop.consumer8085.controller;

import com.shop.api.entity.Goods;
import com.shop.api.utils.FileUtils;
import com.shop.consumer8085.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2021/6/10 13:21
 **/
@Controller
@RequestMapping("api/Goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;


    @GetMapping("toList")
    public String  toList(ModelMap model,Goods good) {
        List<Goods> list = goodsService.list(good);
        model.put("goodList",list);
        System.out.println("进入goods的control");
        return "goods/list";
    }

    @GetMapping("toAdd")
    public String  toAdd(Model model) {
        return "/goods/add";
    }

    @GetMapping("toEdit/{goodsId}")
    public String  toEdit(@PathVariable Integer goodsId,ModelMap model) {
        Goods goods = goodsService.getById(goodsId);
        model.put("goods",goods);
        return "/goods/edit";
    }


    @PostMapping(value = "/add",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String add(@RequestParam String name,
                      @RequestParam BigDecimal price,
                      @RequestParam String describ,
                      @RequestParam String classify, @RequestPart("file") MultipartFile file){
        boolean add = goodsService.add(name, price, describ, classify, file);
        return "redirect:/api/Goods/toList";
    }

    @PostMapping(value = "/update")
    public String update(Goods goods,ModelMap map){
        boolean add = goodsService.update(goods);
        if(add){
            return "redirect:/api/Goods/toList";
        }
        map.put("msg","系统发生错误！！！");
        map.put("goods",goods);
        return "goods/edit";
    }

    @GetMapping("/del/{goodsId}")
    public String del(@PathVariable Integer goodsId){
        boolean del = goodsService.del(goodsId);
        return "redirect:/api/Goods/toList";
    }


    @GetMapping("/img/{goodsId}")
    public void previewImg(@PathVariable Integer goodsId,HttpServletResponse response){
        Goods goods = goodsService.getById(goodsId);
        try {
            if(goods!=null){
                FileUtils.downloadUtil(response, goods.getImgPath()+goods.getImgName(),goods.getImgName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
}