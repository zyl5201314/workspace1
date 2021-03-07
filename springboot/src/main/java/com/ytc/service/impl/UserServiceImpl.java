/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserServiceImpl
 * Author:   zyl
 * Date:     2021/3/5 14:37
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.service.impl;

import com.ytc.dao.UserMapper;
import com.ytc.model.User;
import com.ytc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/3/5
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }

    @Override
    @Transactional(readOnly = true)
    public void addUser(User user) {
        userMapper.addUser(user);
       /* try {
            int i=1/0;
        }catch (Exception e){
            e.printStackTrace();
        }
*/
    }

    @Override
    public void delUser(Integer userid) {
        userMapper.delUser(userid);
    }

    @Override
    public void delsUser(String ids) {
        List<String> list=new ArrayList<>();
        String[] idss=ids.split(",");
        for(String str:idss){
            list.add(str);
        }
        userMapper.delsUser(list);
    }

    @Override
    public User toUpdateUser(Integer userid) {
        return userMapper.toUpdateUser(userid);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }
}
