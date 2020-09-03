package com.shang.webrestfulcrud_02;

import org.apache.tomcat.jni.Local;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.Locale;

//@EnableWebMvc  // 不要接管springMvc
@SpringBootApplication
public class Webrestfulcrud02Application {

    public static void main(String[] args) {
        SpringApplication.run(Webrestfulcrud02Application.class, args);
    }

    @Bean  //添加myViewResolver组件
    public ViewResolver myViewResolver(){
        return new MyViewResolver();
    }
    private static class MyViewResolver implements ViewResolver{  //静态内部类
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
