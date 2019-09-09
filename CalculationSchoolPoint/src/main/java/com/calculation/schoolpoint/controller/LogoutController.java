package com.calculation.schoolpoint.controller;

import com.calculation.schoolpoint.model.UserServiceImpl;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller("logout")
public class LogoutController {
    //@Autowired
    private UserServiceImpl userService;

    //@RequestMapping(value="/logout.do")
    public String logoutController(HttpServletRequest request){
       // request.getSession().removeAttribute();
        return "login.jsp";
    }
}
