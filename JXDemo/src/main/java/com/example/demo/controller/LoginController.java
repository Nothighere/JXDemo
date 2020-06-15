package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by admin on 2020/6/15.
 */
@RestController
@RequestMapping("/login")
public class LoginController {
    @RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
    public ModelAndView loginCheck(@RequestBody Map<String, Object> params){
        if (params.get("name") != null && params.get("password") != null){
            // 获取用户名
            String name = params.get("name").toString();
            String password = params.get("name").toString();
        } else {
            
        }
        ModelAndView modelAndView = new ModelAndView("home/homePage.html");
        return modelAndView;
    }
}
