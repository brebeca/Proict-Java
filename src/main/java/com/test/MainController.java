package com.test;

import com.test.models.Database;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    @RequestMapping("\\")
    public ModelAndView index(){
        ModelAndView modelAndView=new ModelAndView();
        List<String> roles= new ArrayList<>();
        try {
            Connection con= new Database().getConnection();
            PreparedStatement ps = con.prepareStatement("select role from roles");
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                roles.add(rs.getString("usertype"));
            }
        } catch (SQLException | ClassNotFoundException throwables) {

            modelAndView.setViewName("index.jsp");
            modelAndView.addObject("roles","o problema");
            return modelAndView;
        }
        modelAndView.setViewName("index.jsp");
        modelAndView.addObject("roles","user");
        return modelAndView;
    }
}
