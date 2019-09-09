package com.calculation.schoolpoint.controller;

import com.calculation.schoolpoint.model.UserServiceImpl;
import com.calculation.schoolpoint.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("register")
public class RegisterController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/register.do")
    public String registerController(UserVO vo){
        userService.registerUser(vo);
        return "home.jsp";
    }

}
