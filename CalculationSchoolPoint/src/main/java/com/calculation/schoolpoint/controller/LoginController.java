package com.calculation.schoolpoint.controller;

import com.calculation.schoolpoint.model.UserDAO;
import com.calculation.schoolpoint.model.UserServiceImpl;
import com.calculation.schoolpoint.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

@Controller("login")
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value="/login.do", method= RequestMethod.POST)
    public String loginController(UserVO userVo, Model model){

        if(userService.getUser(userVo)!=null){
            System.out.println("out");
            model.addAttribute("user",userVo);

        }
//        else {
//            return new ModelAndView("login");
//        }
        return "view.do";
    }

}
