package com.shang.helloworld_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RestController //等于@Controller+@ResponseBody
public class HelloController {

    @ResponseBody // 返回的数据写给浏览器（若是对象可json返回）
    @RequestMapping("/hellon")
    public String hellon(){
        return "hellon world!";
    }
}
