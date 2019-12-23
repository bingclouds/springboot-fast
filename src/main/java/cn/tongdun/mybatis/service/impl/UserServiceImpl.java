package cn.tongdun.mybatis.service.impl;

import cn.tongdun.mybatis.mapper.UserMapper;
import cn.tongdun.mybatis.model.User;
import cn.tongdun.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by PhychoLee on 2016/11/4 17:18.
 * Description: 用户service实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findById(Integer id) throws SQLException {
        return userMapper.findById(id);
    }

    @Override
    public void insert(User user) throws SQLException {
        userMapper.insert(user);
    }

    /**
     * 测试事务
     * @param userList
     * @throws SQLException
     */
    @Transactional
    public void insertList(List<User> userList) throws SQLException {
        insert(userList.get(0));
        int i = 1/0;
        insert(userList.get(1));
    }
}
