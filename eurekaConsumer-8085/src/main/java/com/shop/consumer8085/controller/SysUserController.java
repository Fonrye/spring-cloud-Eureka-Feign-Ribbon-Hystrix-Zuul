package com.shop.consumer8085.controller;

import com.shop.api.entity.User;
import com.shop.consumer8085.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2021/6/09 07:36
 **/
@Controller
@RequestMapping("/api/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("toList")
    public String toList(ModelMap model, User user) {
        List<User> list = sysUserService.list(user);
        model.put("userList", list);
        return "user/list";
    }

    @GetMapping("toAdd")
    public String toAdd(Model model) {
        return "user/add";
    }

    @GetMapping("toEdit/{userId}")
    public String toEdit(@PathVariable Integer userId, ModelMap model) {
        User user = sysUserService.getById(userId);
        model.put("sysUser", user);
        return "user/edit";
    }

    @PostMapping("add")
    public String add(User user){
        sysUserService.add(user);
        return "redirect:/api/user/toList";
    }

    // 删除
    @GetMapping(value = "/del/{userId}")
    public String del(@PathVariable Integer userId){
        sysUserService.del(userId);
        return "redirect:/api/user/toList";
    }

    @PostMapping("/update")
    public String update(User user){
        sysUserService.update(user);
        return "redirect:/api/user/toList";
    }


}
