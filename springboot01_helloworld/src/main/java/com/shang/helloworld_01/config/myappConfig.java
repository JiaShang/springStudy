package com.shang.helloworld_01.config;

import com.shang.helloworld_01.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //标注为配置类
public class myappConfig {
    @Bean //将方法的返回值添加到容器中，方法名就是组件的id
    public HelloService helloService(){
        System.out.println("给容器中添加组件了！");
        return new HelloService();
    }
}
