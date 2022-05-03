package com.yang.dao;

import com.yang.pojo.User;

import java.util.List;

public interface UserMapper {
    //    获取全部数据
    List<User> getUserList();

    // 根据id查询用户
    User getUserByid(int id);

    // 插入用户
    int addUser(User user);

    // 修改用户
    int updateUser(User user);

    // 删除用户
    int deleteUser(int id);
}
