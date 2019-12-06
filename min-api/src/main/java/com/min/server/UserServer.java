package com.min.server;

import com.min.mapper.UserMapper;
import com.min.to.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServer {
    @Autowired
    private UserMapper userMapper;

    public User findById(String id){
        return userMapper.findById(id);
    }

    public List<User> findAll(){
        return userMapper.findAll();
    }
}
