package com.ytc.mapper;

import com.ytc.model.User;

import java.util.List;

public interface UserMapper {

    List<User> queryUserList();

    void addUser(User user);

    void delUser(Integer id);

    User toUpdateUser(Integer id);

    void updateUser(User user);
}