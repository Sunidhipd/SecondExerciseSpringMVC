package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/")
    public String gotofirst(Model map) {
        return "users";
    }

    @RequestMapping("populate")
    public ModelAndView populateUser(@RequestParam("username") String UserName, @RequestParam("password") String Password) {
        User user = new User();
        user.setPassword(Password);
        user.setName(UserName);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user");
        mv.addObject("obj", user.getName());
        return mv;
    }
}
