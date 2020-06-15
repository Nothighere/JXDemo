package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by admin on 2020/6/15.
 */
@RestController
@RequestMapping("/mainPage")
public class MainPageController{
    @RequestMapping("/init")
    public Map<String,Object> initHomePage(){
        Map<String, Object> resMap = new HashMap<>();
        resMap.put("id","12345");
        resMap.put("name","王小明");
        resMap.put("age","18");
        return resMap;
    }
}
