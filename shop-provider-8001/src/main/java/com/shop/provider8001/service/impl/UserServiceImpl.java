package com.shop.provider8001.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.api.entity.User;
import com.shop.provider8001.mapper.UserMapper;
import com.shop.provider8001.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @Override
    public List<User> listAll(User user){
    	return userMapper.listAll(user);
    }


    /**
     * 根据主键查询
     *
     * @param userId 主键
     * @return 返回记录，没有返回null
     */
    @Override
    public User getById(Integer userId) {
    	return userMapper.getById(userId);
    }
	
    /**
     * 新增，插入所有字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
    public int insert(User user) {
    	return userMapper.insert(user);
    }
	
    /**
     * 新增，忽略null字段
     *
     * @param user 新增的记录
     * @return 返回影响行数
     */
    @Override
    public int insertIgnoreNull(User user) {
    	return userMapper.insertIgnoreNull(user);
    }
	
    /**
     * 修改，修改所有字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int update(User user) {
    	return userMapper.update(user);
    }
	
    /**
     * 修改，忽略null字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    @Override
    public int updateIgnoreNull(User user) {
    	return userMapper.updateIgnoreNull(user);
    }
	
    /**
     * 删除记录
     *
     * @param user 待删除的记录
     * @return 返回影响行数
     */
    @Override
    public int delete(User user) {
    	return userMapper.delete(user);
    }
	
}