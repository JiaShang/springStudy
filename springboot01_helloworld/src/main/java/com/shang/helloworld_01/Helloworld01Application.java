package com.shang.helloworld_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@ImportResource(locations = {"classpath:beans.xml"})//在主程序类导入自己写的配置文件，才能生效
@SpringBootApplication //标注主程序类
public class Helloworld01Application {
    //启动入口
    public static void main(String[] args) {
        SpringApplication.run(Helloworld01Application.class, args);
    }

}
