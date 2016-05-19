package com.qrra.spring.helloworld.impl;

import com.qrra.spring.helloworld.HelloWorld;

import org.springframework.stereotype.Service;

@Service("engHelloWorld")
public class EngHelloWorld implements HelloWorld {

    public static final String GREETING = "Hi! How are you?";

    @Override
    public String sayHello() {
        System.out.println(GREETING);
        return GREETING;
    }
}