package com.shang.helloworld_01;

import com.shang.helloworld_01.modle.Person;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Helloworld01ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    //日志记录器
    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService"); // 测试容器中是否包含helloService bean
        System.out.println("存在helloService？："+b);
    }
    @Test
    void contextLoads() {
        System.out.println(person.toString());
        //日志级别 由低到高，spring boot  默认info级别
        logger.trace("这是跟踪轨迹日志！");
        logger.debug("这是调试日志！");
        logger.info("这是自定义日志！");
        logger.warn("这是警告日志！");
        logger.error("这是错误日志！");
    }

}
