package com.qrra.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml", "context.xml");

        ((HelloWorld) context.getBean("chnHelloWorld")).sayHello();

        ((HelloWorld) context.getBean("engHelloWorld")).sayHello();

        HelloWorldService service =
                (HelloWorldService) context.getBean("helloWorldService");

        HelloWorld helloWorld = service.getHelloWorld();

        helloWorld.sayHello();
    }
}