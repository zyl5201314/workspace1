package com.ytc.model;

import java.io.Serializable;

public class User implements Serializable{

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
        this.username = username == null ? null : username.trim();
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

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", usersex=" + usersex +
                ", userdate=" + userdate +
                ", userprice=" + userprice +
                '}';
    }
}