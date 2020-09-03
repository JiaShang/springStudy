package com.shang.webrestfulcrud_02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody //直接写给浏览器
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @RequestMapping("/success")  //在classpath:templates/下寻找success.html
    public String success(Map<String,Object> map){
        map.put("hello","你好！");
        map.put("boss", Arrays.asList("shang","jia","liu","li"));
        return "success";
    }

    @RequestMapping({"/","/index.html"})  //在classpath:templates/下寻找index.html
    public String index(Map<String,Object> map){
        return "index";
    }
}
