package cn.tongdun.mybatis.mapper;

import cn.tongdun.mybatis.model.User;

public interface UserMapper {
    User findById(Integer id);

    int insert(User record);

    int insertSelective(User record);
}