package com.hanzhi.controller;

import com.hanzhi.entity.User;
import com.hanzhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Title: UserCtrl
 * @ProjectName auth_test
 * @Description: TODO
 * @date 2019/4/17 001716:08
 */
@RestController
public class UserCtrl {
    @Autowired
    UserService userService;
    /*@ResponseBody
    @RequestMapping("/login")
    public int login(String username,String password) {
        return userService.login(username,password);
//
    }*/
    @ResponseBody
    @RequestMapping("/")
    public String def(String username,String password) {
        return "";
//
    }
}
