/**
 * Copyright (C), 2015-2021, XXX有限公司
 * FileName: UserService
 * Author:   zyl
 * Date:     2021/3/5 14:36
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
 * @create 2021/3/5
 * @since 1.0.0
 */
public interface UserService {
    List<User> queryUserList();

    void addUser(User user);

    void delUser(Integer userid);

    void delsUser(String ids);

    User toUpdateUser(Integer userid);

    void updateUser(User user);
}
