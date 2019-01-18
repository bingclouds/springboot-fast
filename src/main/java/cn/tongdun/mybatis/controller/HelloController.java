package cn.tongdun.mybatis.controller;

import cn.tongdun.mybatis.dao.UserDao;
import cn.tongdun.mybatis.model.User;
import cn.tongdun.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;

/**
 * Created by PhychoLee on 2016/10/13.
 * Description:
 */
@RestController
public class HelloController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserDao userDao;

    @RequestMapping("/")
    public User getUser(){
        User user =null;
        try {
            user = userDao.findById(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}
