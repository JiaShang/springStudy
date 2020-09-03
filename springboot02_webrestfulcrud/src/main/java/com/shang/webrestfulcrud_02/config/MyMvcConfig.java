package com.shang.webrestfulcrud_02.config;

import com.shang.webrestfulcrud_02.component.MyLocaleResolver;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//使用WebMvcConfigurer 可以扩展springMvc功能  既保留的spring自动配置，也能用自己扩展的配置
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Override  //重写方法  ctrl+o 调出可重写的方法
    //视图映射
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/shang").setViewName("success");  //把浏览器/shang请求映射到success页面
    }

    //所有的WebMvcConfigurer会加在一起作用
    @Bean  //将自己定义的组件加入容器中
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer webMvcConfigurer = new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/index.html").setViewName("index");
            }
        };
        return webMvcConfigurer;
    }


    @Bean   //把自己的MyLocaleResolver加入容器
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
