package com.data.source.multi.demo.controller;

import com.data.source.multi.demo.entity.User;
import com.data.source.multi.demo.service.serviceImpl.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user")
    @ResponseBody
    public User user(){
        return userService.getUserByName("liumeng");
    }
}
