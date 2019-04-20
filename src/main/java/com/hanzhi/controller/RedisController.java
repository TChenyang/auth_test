package com.hanzhi.controller;

import com.hanzhi.entity.User;
import com.hanzhi.service.IRedisService;
import com.hanzhi.service.UserService;
import com.hanzhi.service.serviceImpl.IRedisServiceImpl;
import com.sun.tools.javac.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Administrator
 * @Title: RedisController
 * @ProjectName auth_test
 * @Description: TODO
 * @date 2019/4/20 002017:38
 */
@Controller
public class RedisController {
    private final static Logger log = LoggerFactory.getLogger(RedisController.class);

    @Autowired
    private IRedisService iRedisService;
    @Autowired
    private UserService userService;

    @GetMapping("/get")
    @ResponseBody
    public String test(){
        return iRedisService.get("hello");
    }

    @GetMapping("/set")
    @ResponseBody
    public String set(){
        try{
            iRedisService.set("hello","world");
            return "set Ok";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
    @GetMapping("/getUserList/{userid}")
    @ResponseBody
    public User getUserList(@PathVariable  Integer userid){
        User result = iRedisService.get("user: "+userid,User.class);
        if(result==null){
            result = userService.selectByPrimaryKey(userid);
            iRedisService.set("user: "+result.getUserid(),result);
        }
        log.info(result.toString());
        return result;
    }
}
