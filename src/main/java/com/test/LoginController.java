package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class LoginController {

    @RequestMapping("/login")
    public void login(HttpServletRequest req, HttpServletResponse response){
         String username= req.getParameter("username");
         String password= req.getParameter("password");
         ModelAndView mv =new ModelAndView();
         mv.setViewName("index.jsp");
         mv.addObject("te-ai conectat");
    }
}
