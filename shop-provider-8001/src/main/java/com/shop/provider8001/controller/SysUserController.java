package com.shop.provider8001.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.shop.api.entity.User;
import com.shop.provider8001.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author 666
 */
@RestController
@RequestMapping("User")
public class SysUserController {

    @Autowired
    private IUserService userService;

    /**
     * 查询所有记录
     *
     * @return 返回集合，没有返回空List
     */
    @RequestMapping("list")
    public List<User> listAll(User user, Model model) {
        return userService.listAll(user);
    }


    @PostMapping("/queryOne")
    public User queryone(@RequestBody User user){
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(User::getUserName,user.getUserName())
                .eq(User::getPassword,user.getPassword());
       return userService.getOne(queryWrapper);
    }

    /**
     * 根据主键查询
     * @param  userId 主键
     * @return 返回记录，没有返回null
     */
    @RequestMapping("getById/{userId}")
    public User getById(@PathVariable Integer userId) {
        return userService.getById(userId);
    }



    /**
     * 新增，忽略null字段
     * @param user 新增的记录
     * @return 返回影响行数
     */
    @RequestMapping("insertIgnore")
    public boolean insertIgnoreNull(@RequestBody User user) {
        return userService.insertIgnoreNull(user)>0;
    }

    /**
     * 修改，忽略null字段
     *
     * @param user 修改的记录
     * @return 返回影响行数
     */
    @RequestMapping("updateIgnoreNull")
    public boolean updateIgnoreNull(@RequestBody User user) {
        return userService.updateIgnoreNull(user)>0;
    }

    /**
     * 删除记录
     *
     * @param userID 待删除的记录
     * @return 返回影响行数
     */
    @RequestMapping("delete/{userID}")
    public boolean delete(@PathVariable Integer userID) {
        User user = new User();
        user.setUserId(userID);
        return  userService.delete(user)>0;
    }

}