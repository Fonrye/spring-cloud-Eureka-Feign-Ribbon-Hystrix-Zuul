package com.eurekaconsumershop8080.controller;

import com.eurekaconsumershop8080.service.GoodsService;
import com.shop.api.entity.Goods;
import com.shop.api.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2021/6/08 07:40
 **/
@Controller
@RequestMapping()
public class ShopIndexController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping({"/","/shop"})
    public String shopIndex(Goods goods, ModelMap map){
        return "index";
    }



    @GetMapping("/shop/preimg")
    public void previewImg(@RequestParam("p") String imgPath,@RequestParam("n") String imgName, HttpServletResponse response){
        try {
            if(!"".equals(imgPath) && !"".equals(imgName)){
                FileUtils.downloadUtil(response, imgPath+imgName,imgName);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
