package com.ytc.dao;

import com.ytc.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> queryUserList();

    void addUser(User user);

    void delUser(Integer userid);

    void delsUser(List<String> ids);

    User toUpdateUser(@Param("uid") Integer userid);

    void updateUser(User user);
}