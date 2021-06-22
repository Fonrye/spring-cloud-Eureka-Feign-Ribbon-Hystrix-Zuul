package com.eurekaconsumershop8080.service;

import com.eurekaconsumershop8080.config.HystrixConfig;
import com.eurekaconsumershop8080.service.impl.SysUserServiceImpl;
import com.shop.api.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "EUREKA-PROVIDER",
        configuration = HystrixConfig.class,
        fallback = SysUserServiceImpl.class)
public interface SysUserService {

    @GetMapping("User/list")
    List<User> list(User user);

    @GetMapping("User/queryOne")
    User queryOne(@RequestBody User user);

    @RequestMapping("User/getById/{userId}")
    User getById(@PathVariable Integer userId);

    @PostMapping(value = "User/updateIgnoreNull")
    boolean update(@RequestBody User user);

    // 删除
    @GetMapping(value = "User/delete/{userId}")
    boolean del(@PathVariable Integer userId);

    @PostMapping("User/insertIgnore")
    boolean add(@RequestBody User user);
}
