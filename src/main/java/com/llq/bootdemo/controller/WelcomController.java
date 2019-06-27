package com.llq.bootdemo.controller;

import com.llq.bootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class WelcomController {

    @Autowired
    UserService userService;
    @RequestMapping("/welcom")
    public String index( Long id){
        return userService.queryUserList(id).toString();
    }
}
