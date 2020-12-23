package com.cjw.controller;

import com.cjw.po.User;
import com.cjw.service.UserService;
import com.cjw.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/login")
    public String login(User user, HttpSession session){
        User u = userService.login(user.getUserName(), user.getUserPassword());
        System.out.println("u = " + u);
        if (u!=null){
            session.setAttribute("user",u);
            return "main";
        }else{
            return "error";
        }
    }

}
