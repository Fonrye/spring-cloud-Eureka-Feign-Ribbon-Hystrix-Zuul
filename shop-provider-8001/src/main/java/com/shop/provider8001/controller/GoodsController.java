package com.shop.provider8001.controller;

import com.shop.api.config.UpDownLoadConfig;
import com.shop.api.entity.Goods;
import com.shop.provider8001.service.IGoodsService;
import com.shop.provider8001.utils.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("Goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;

    private static final String INDEX_PAGE = "admin/admin-goods";
    private static final String EDIT_PAGE = "goods/edit";



    @RequestMapping("/toEdit/{goodsID}")
    private String toEdit(@PathVariable String goodsID, Model model) {
        model.addAttribute("btnType", "edit");
        Goods goods = goodsService.getById(goodsID);
        model.addAttribute("goods", goods);
        List<Goods> goodsList = goodsService.listAll(new Goods());
        model.addAttribute("goodsOptions", goodsList);
        return EDIT_PAGE;
    }


    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<Goods> listAll(Goods goods) {
        return goodsService.listAll(goods);
    }


    /**
     * 根据主键查询
     *
     * @param goodsId 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById/{goodsId}")
    public Goods getById(@PathVariable Integer goodsId) {
        return goodsService.getById(goodsId);
    }



    /**
     * 新增，忽略null字段
     * @return 返回影响行数
     */
    @PostMapping(value="insertIgnore",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public boolean insertIgnoreNull(@RequestParam String name,
                                    @RequestParam BigDecimal privce,
                                    @RequestParam String describ,
                                    @RequestParam String classify, @RequestPart("file") MultipartFile file) throws IOException {
        Goods goods = new Goods(name,privce,describ,classify);
        if (file != null) {
            LocalDateTime nowDateTime = LocalDateTime.now();
            ArrayList<String> dateList = new ArrayList<>();
            dateList.add(String.valueOf(nowDateTime.getYear()));
            dateList.add(String.valueOf(nowDateTime.getMonthValue()));
            dateList.add(String.valueOf(nowDateTime.getDayOfMonth()));

            StringBuilder pathBuild = new StringBuilder(UpDownLoadConfig.uploadPath);
            dateList.forEach(item -> {
                pathBuild.append("/").append(item);
            });
            String uploadFileName = String.valueOf(System.currentTimeMillis()) + file.getOriginalFilename();
            Boolean aBoolean = com.shop.api.utils.FileUtils.upLoadUtil(pathBuild.toString(), uploadFileName, file);
            pathBuild.append("/");
            if(aBoolean){
                goods.setImgPath(pathBuild.toString());
                goods.setImgName(uploadFileName);
            }
            goodsService.insertIgnoreNull(goods);
            return aBoolean;
        }
        goodsService.insertIgnoreNull(goods);
        return false;
    }


    /**
     * 修改，修改所有字段
     *
     * @param goods 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("update")
    public boolean update(@RequestBody Goods goods) {
        return goodsService.update(goods)>0;
    }

    /**
     * 修改，忽略null字段
     *
     * @param goods 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("updateIgnoreNull")
    public boolean updateIgnoreNull(@RequestBody Goods goods) {
        return  goodsService.updateIgnoreNull(goods)>0;
    }
    /**
     * 删除记录
     *
     * @param goodsID 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete/{goodsID}")
    public boolean delete(@PathVariable Integer goodsID) {
        Goods delGoods = goodsService.getById(goodsID);
        Goods goods = new Goods();
        goods.setGoodsId(goodsID);
        int delete = goodsService.delete(goods);
        if(delete>0){
            FileUtils.deleteFile(delGoods.getImgPath()+delGoods.getImgName());
        }
        return delete>0;
    }

}