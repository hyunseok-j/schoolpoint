package com.calculation.schoolpoint.controller;

import com.calculation.schoolpoint.model.UserDAO;
import com.calculation.schoolpoint.model.UserServiceImpl;
import com.calculation.schoolpoint.model.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller("view")
public class ViewController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/view.do")
    public String viewController(UserVO userVo, Model model){
        model.addAttribute("user",userService.getUser(userVo));
        model.addAttribute("userList",userService.getListUser(userVo));

        return "view.jsp";
    }
}
