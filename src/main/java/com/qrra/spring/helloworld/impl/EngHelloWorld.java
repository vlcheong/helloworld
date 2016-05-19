package com.qrra.spring.helloworld.impl;

import com.qrra.spring.helloworld.HelloWorld;

import org.springframework.stereotype.Service;

@Service("engHelloWorld")
public class EngHelloWorld implements HelloWorld {

    @Override
    public void sayHello() {
        System.out.println("Hi! How are you?");
    }
}