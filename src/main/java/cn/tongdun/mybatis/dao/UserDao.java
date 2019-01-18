package cn.tongdun.mybatis.dao;



import cn.tongdun.mybatis.model.User;

import java.sql.SQLException;

public interface UserDao {

//    @Select("select * from user where id = #{id}")
    User findById(Integer id) throws SQLException;

    void insert(User user) throws SQLException;
}