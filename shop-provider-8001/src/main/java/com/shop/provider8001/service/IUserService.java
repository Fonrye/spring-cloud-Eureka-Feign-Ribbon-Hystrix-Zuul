package com.shop.provider8001.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shop.api.entity.User;

import java.util.List;

public interface IUserService extends IService<User> {
    public User getById(Integer userId);
    public int insertIgnoreNull(User user);
    public int update(User user);
    public int updateIgnoreNull(User user);
    public int delete(User user);
    public List<User> listAll(User user);
}
