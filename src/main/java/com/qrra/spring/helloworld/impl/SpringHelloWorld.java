package com.qrra.spring.helloworld.impl;

import com.qrra.spring.helloworld.HelloWorld;

public class SpringHelloWorld implements HelloWorld {

    @Override
    public void sayHello() {
        System.out.println("Spring Says Hello !!!");
    }
}