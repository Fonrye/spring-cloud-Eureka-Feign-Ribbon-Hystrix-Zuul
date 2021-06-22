package com.eurekaconsumershop8080.controller;

import com.eurekaconsumershop8080.service.SysUserService;
import com.shop.api.entity.User;
import com.shop.api.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2021/6/11 11:40
 **/
@Controller
@RequestMapping("/api/shop")
public class ShopLoginController {

    @Autowired
    private SysUserService sysUserService;


    @GetMapping("tologin")
    public String toLogin(){
        return "shop/login";
    }
    @GetMapping("toRegister")
    public String toRegister(){
        return "shop/register";
    }



    @PostMapping("login")
    @ResponseBody
    public R login(@RequestBody User user){
        User u= sysUserService.queryOne(user);
        if(u==null){
            return new R().error("用户名或密码错误");
        }
        u.setPassword(null);
        return new R().ok().setData(u);
    }

    @GetMapping("logout")
    public String logout(HttpSession session){
        session.removeAttribute("loginUser");
        return "redirect:/";
    }

}
