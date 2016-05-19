package com.qrra.spring.helloworld.impl;

import com.qrra.spring.helloworld.HelloWorld;

import org.springframework.stereotype.Service;

@Service("chnHelloWorld")
public class ChnHelloWorld implements HelloWorld {

    @Override
    public void sayHello() {
        System.out.println("嗨！你好吗？");
    }
}