package com.qrra.spring.helloworld.impl;

import com.qrra.spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld {

    public static final String HELLO = "Spring Says Hello !!!";

    @Override
    public String sayHello() {
        System.out.println(HELLO);
        return HELLO;
    }
}