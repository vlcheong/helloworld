package com.qrra.spring.helloworld.impl;

import com.qrra.spring.helloworld.HelloWorld;

public class JavaEEHelloWorld implements HelloWorld {

    public static final String HELLO = "JavaEE Says Hello !!!";

    @Override
    public String sayHello() {
        System.out.println(HELLO);
        return HELLO;
    }
}