package com.hanzhi.service;

import com.hanzhi.dao.UserMapper;
import com.hanzhi.entity.User;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 * @Title: UserService
 * @ProjectName auth_test
 * @Description: TODO
 * @date 2019/4/17 001716:07
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    /*public int login(String username,String password){
        return userMapper.loginByUser(username,password);
    }*/
    public List<User> getUserList(){
        return userMapper.selectUser();
    }

    public User selectByPrimaryKey(Integer userid){
        return userMapper.selectByPrimaryKey(userid);
    }
}
