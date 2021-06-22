package com.shop.consumer8085.controller;


import com.shop.api.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author Fonrye
 * @version 1.0
 * @creat by IntelliJ IDEA
 * @date 2021/6/05 10:11
 **/
@Controller
@RequestMapping
public class LoginController {


    @GetMapping({"/","/index"})
    public String loginIndex(){
        return "loginIndex";
    }

    /**
     * 用户登录
     * @param user
     * @return
     */
    @PostMapping("/login")
    public String login(User user){
        return "redirect:/mIndex";
    }

    @GetMapping("/mIndex")
    public String toIndexMain(){
        return "adminIndex";
    }




}
