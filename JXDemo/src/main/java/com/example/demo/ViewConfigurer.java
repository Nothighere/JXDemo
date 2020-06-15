package com.example.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by admin on 2020/6/15.
 */
@Configuration
public class ViewConfigurer implements WebMvcConfigurer {

    /**
     * 默认首页设置，当请求时项目地址的时候 返回login
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/login.html").setViewName("login");
        //registry.addViewController("/main.html").setViewName("dashboard");
    }
}