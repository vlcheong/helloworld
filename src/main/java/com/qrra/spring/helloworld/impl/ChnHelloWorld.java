package com.qrra.spring.helloworld.impl;

import com.qrra.spring.helloworld.HelloWorld;

import org.springframework.stereotype.Service;

@Service("chnHelloWorld")
public class ChnHelloWorld implements HelloWorld {

    public static final String GREETING = "嗨！你好吗？";

    @Override
    public String sayHello() {
        System.out.println(GREETING);
        return GREETING;
    }
}