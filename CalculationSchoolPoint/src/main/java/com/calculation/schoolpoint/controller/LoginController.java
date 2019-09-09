package com.calculation.schoolpoint.controller;

import com.calculation.schoolpoint.model.UserDTO;
import com.calculation.schoolpoint.model.UserServiceImpl;
import com.calculation.schoolpoint.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller("login")
public class LoginController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value="/login.do", method= RequestMethod.POST)
    public String loginController(UserDTO userDTO, Model model){

        UserVO userVO = userService.login(userDTO);
        if(userVO != null){
            model.addAttribute("user",userVO);
        }
        return "view.do";
    }

}
