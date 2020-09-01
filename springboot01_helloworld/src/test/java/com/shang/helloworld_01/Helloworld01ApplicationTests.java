package com.shang.helloworld_01;

import com.shang.helloworld_01.modle.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Helloworld01ApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService(){
        boolean b = ioc.containsBean("helloService"); // 测试容器中是否包含helloService bean
        System.out.println("存在helloService？："+b);
    }
    @Test
    void contextLoads() {
        System.out.println(person.toString());
    }

}
