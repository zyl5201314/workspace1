/**
 * Copyright (C), 2019, 因特驰
 * FileName: UserController
 * Author:   zyl
 * Date:     2021/3/5 14:24
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
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author zyl
 * @create 2021/3/5
 * @since 1.0.0
 */
@Controller
//@RestController
public class UserController {

    @Autowired
    private UserService userService;
//    @RequestMapping("hello")
//    //@ResponseBody
//    public String hello(){
//        return "hello springboot";
//    }

    /**
     * 查询方法
     * @param model
     * @return
     */
    @RequestMapping("queryUserList")
    public String queryUserList(Model model){
        System.out.println("你好");
        System.out.println("你好2");
       List<User> list= userService.queryUserList();
       model.addAttribute("list",list);
       return "showUser";
    }

    /**
     * 跳转新增页面
     * @return
     */
    @RequestMapping(value = "toAdd",method = RequestMethod.GET)
//    @PostMapping  增加
//    @DeleteMapping 删除
//    @PutMapping  修改
  //  @GetMapping("toAdd")//查询
    public String toAdd(){
        return "addUser";
    }

    /**
     * 新增
     * @return
     */
    @PostMapping("addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "redirect:queryUserList";
    }

    /**
     * 删除
     * @return
     */
    @RequestMapping("delUser")
    public String delUser(Integer userid){
        userService.delUser(userid);
        return "redirect:queryUserList";
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @RequestMapping("delsUser")
    public String delsUser(String ids){
        userService.delsUser(ids);
        return "redirect:queryUserList";
    }

    /**
     * 修改前的回填操作
     * @param userid
     * @return
     */
    @RequestMapping("toUpdateUser")
    public String toUpdateUser(Integer userid,Model model){
        User user =userService.toUpdateUser(userid);
        model.addAttribute("user",user);
        return "updateUser";
    }

    /**
     * 修改
     * @param user
     * @return
     */
    @RequestMapping("updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "redirect:queryUserList";
    }
}
