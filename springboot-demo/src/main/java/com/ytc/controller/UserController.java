/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserController
 * Author:   zyl
 * Date:     2021/1/19 15:11
 * History:
 * zyl          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.ytc.controller;

import com.ytc.model.User;
import com.ytc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/1/19
 * @since 1.0.0
 */
/*@Controller
@RequestMapping("/user")*/
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /*@RequestMapping("/hello")
    public String hello(){
     return "hello springboot";
    }*/

    @RequestMapping("queryUserList")
    public String queryUserList(Model m) throws Exception{
       List<User> list=userService.queryUserList();
       m.addAttribute("list",list);
      return "showUser";
    }

    @RequestMapping("toAdd")
    public String toAdd(){
      return "addUser";
    }
    @RequestMapping("addUser")
    public String addUser(User user){
     System.out.print(user);
     userService.addUser(user);
     return "redirect:queryUserList";
    }
    @RequestMapping("delUser")
    public String delUser(Integer id){
        userService.delUser(id);
        return "redirect:queryUserList";
    }

    @RequestMapping("toUpdateUser")
    public String toUpdateUser(Integer id,Model m){
        User user=userService.toUpdateUser(id);
        m.addAttribute("u",user);
        return "updateUser";
    }

    @RequestMapping("updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:queryUserList";
    }
}
