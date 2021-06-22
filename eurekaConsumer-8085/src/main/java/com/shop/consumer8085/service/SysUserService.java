package com.shop.consumer8085.service;

import com.shop.api.entity.User;
import com.shop.consumer8085.config.HystrixConfig;
import com.shop.consumer8085.service.impl.SysUserserviceIimpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "EUREKA-PROVIDER",configuration = HystrixConfig.class,fallback = SysUserserviceIimpl.class)
public interface SysUserService {

    @GetMapping("User/list")
    List<User> list(User user);

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
