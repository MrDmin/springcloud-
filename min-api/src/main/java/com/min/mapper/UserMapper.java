package com.min.mapper;

import com.min.to.User;

import java.util.List;

public interface UserMapper {
    public User findById(String id);
    public List<User> findAll();
}
