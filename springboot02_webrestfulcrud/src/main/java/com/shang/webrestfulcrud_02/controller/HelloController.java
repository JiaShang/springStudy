package com.shang.webrestfulcrud_02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody //直接写给浏览器
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("/success")  //在classpath:templates/下寻找success.html
    public String success(){
        return "success";
    }
}
