/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: UserService
 * Author:   zyl
 * Date:     2021/1/19 15:26
 * History:
 */
package com.ytc.service;

import com.ytc.model.User;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/1/19
 * @since 1.0.0
 */
public interface UserService {
    List<User> queryUserList();

    void addUser(User user);

    void delUser(Integer id);

    User toUpdateUser(Integer id);

    void updateUser(User user);
}
