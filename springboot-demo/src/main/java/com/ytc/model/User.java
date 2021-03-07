/**
 * Copyright (C), 2019, 因特驰
 * FileName: User
 * Author:   zyl
 * Date:     2021/1/19 15:20
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.model;

import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/1/19
 * @since 1.0.0
 */
public class User implements Serializable{

    private static final long serialVersionUID = -5501298339282129812L;

    private Integer userid;
    private String username;
    private Integer usersex;
    private String userdate;
    private Double userprice;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUsersex() {
        return usersex;
    }

    public void setUsersex(Integer usersex) {
        this.usersex = usersex;
    }

    public String getUserdate() {
        return userdate;
    }

    public void setUserdate(String userdate) {
        this.userdate = userdate;
    }

    public Double getUserprice() {
        return userprice;
    }

    public void setUserprice(Double userprice) {
        this.userprice = userprice;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usersex=" + usersex +
                ", userdate='" + userdate + '\'' +
                ", userprice=" + userprice +
                '}';
    }
}
