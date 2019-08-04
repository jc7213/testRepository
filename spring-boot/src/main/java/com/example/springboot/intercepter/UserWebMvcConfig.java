package com.example.springboot.intercepter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration//表示当前类未CodeConfig类，即充当spring容器
public class UserWebMvcConfig implements WebMvcConfigurer {


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //拦截/user/first开头的请求
        registry.addInterceptor(UserIntercepter()).addPathPatterns("/user/first/**");
    }

    @Bean
    public  UserIntercepter UserIntercepter(){
        return new UserIntercepter();
    }

}
