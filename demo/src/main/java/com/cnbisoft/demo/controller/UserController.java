package com.cnbisoft.demo.controller;

import com.cnbisoft.demo.entity.User;
import com.cnbisoft.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Description
 *
 * @author djl
 * @version 1.0
 * @taskId:
 * @createDate 2020/12/20 13:54
 * @project: demo
 * @see com.cnbisoft.demo.controller
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/queryAllUsers")
    public List<User> queryAllUsers(){
        return userService.queryAllUsers();
    }

    @GetMapping(value = "/queryUserById")
    public User queryUserById(@RequestParam("id") Integer id) {
        return userService.queryUserById(id);
    }


    @GetMapping(value = "/addUser")
    public String addUser(User user){
        userService.addUser(user);
        return "添加用戶成功";
    }

    @GetMapping(value = "/updateUser")
    public String updateUser(User user){
        userService.updateUser(user);
        return "修改用戶成功";
    }

    @GetMapping(value = "/deleteUserById")
    public String deleteUserById(@RequestParam("id") Integer id){
        userService.deleteUserById(id);
        return "刪除用戶成功";
    }
}