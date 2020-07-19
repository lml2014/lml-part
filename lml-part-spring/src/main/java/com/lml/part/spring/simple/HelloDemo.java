package com.lml.part.spring.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author shuishan
 * @date 2020/3/18
 */
public class HelloDemo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("simple/spring-bean.xml");
        HelloService helloService = (HelloService) context.getBean("helloService");
        helloService.hello();
    }
}
