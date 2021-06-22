package com.shop.consumer8085.service.impl;

import com.shop.api.entity.User;
import com.shop.consumer8085.service.SysUserService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SysUserserviceIimpl implements SysUserService {
    @Override
    public List<User> list(User user) {
        return null;
    }

    @Override
    public User getById(Integer userId) {
        return null;
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean del(Integer userId) {
        return false;
    }

    @Override
    public boolean add(User user) {
        return false;
    }
}
