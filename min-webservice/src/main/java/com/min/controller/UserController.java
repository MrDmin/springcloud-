package com.min.controller;

import com.min.to.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
    private String REST_URL_PREFIX = "http://min-user-api";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/user/get/{id}" , method = RequestMethod.GET)
    private User getUserByID(@PathVariable("id") String id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/user/get/" + id,User.class);
    }
}
