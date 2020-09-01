package com.shang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //标注主程序类
public class HelloWorldMainApplication {
    public static void main(String[] args){
        //启动入口
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
