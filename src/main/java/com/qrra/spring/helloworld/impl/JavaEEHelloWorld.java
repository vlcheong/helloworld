package com.qrra.spring.helloworld.impl;

import com.qrra.spring.helloworld.HelloWorld;

public class JavaEEHelloWorld implements HelloWorld {

    @Override
    public void sayHello() {
        System.out.println("JavaEE Says Hello !!!");
    }
}