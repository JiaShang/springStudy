package com.shang.helloworld_01.modle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

@PropertySource(value = {"classpath:person.properties"})//读取指定的properties文件，不写的话，默认从全局配置文件中获取
@Component  // 将组件加入容器中；才能使用@ConfigurationProperties功能
@ConfigurationProperties(prefix = "person")  //本类中的属性在配置文件中获取 ,可个给单个属性添加注解
public class Person {


//    @Email //name必须是邮件格式
    @Value("${person.name}")  // 从配置文件中获取
    private String name;
//    @Value("${2*9}")  //可支持运算
    private Integer age;

    private Boolean boss;
    private Date birth;
    private Map<String,Object> maps;
    private List<Object> lists;

    private Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }
}
