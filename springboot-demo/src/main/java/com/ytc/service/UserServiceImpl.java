/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserServiceImpl
 * Author:   zyl
 * Date:     2021/1/19 15:27
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service;

import com.ytc.mapper.UserMapper;
import com.ytc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/1/19
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(cacheNames = "queryUserList")
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    //@Transactional
    public void addUser(User user) {
        userMapper.addUser(user);
        int i=1/0;
    }

    @Override
    public void delUser(Integer id) {
        userMapper.delUser( id);
    }

    @Override
    public User toUpdateUser(Integer id) {
        return userMapper.toUpdateUser(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
