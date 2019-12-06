package com.min.controller;

import com.min.server.UserServer;
import com.min.to.User;
import com.min.utils.ApplicationContextUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    private UserServer userServer;
    @HystrixCommand(fallbackMethod = "getUserFallBack")
    @RequestMapping(value = "/user/get/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable String id){

//      bean调用方法
//      UserServer bean = (UserServer) ApplicationContextUtils.getBean("userServer");
//      User user = bean.findById(id);
        User user = userServer.findById(id);
        if(user == null){
            throw new RuntimeException("id:" + id + "cant not find record.");
        }
        return user;

    }

    @RequestMapping(value = "/user/findAll", method = RequestMethod.GET)
    public List<User> findAll(){
        List<User> users = userServer.findAll();
        if(users == null || users.size()<1){
            throw new RuntimeException("cant not find record.");
        }
        return users;

    }

    public User getUserFallBack(@PathVariable String id){
        return new User(id,"[min-api]:cannot get value","[min-api]:cannot get value");
    }
}
