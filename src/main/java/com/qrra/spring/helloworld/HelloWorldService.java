package com.qrra.spring.helloworld;

public class HelloWorldService {

    private HelloWorld helloWorld;

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public HelloWorld getHelloWorld() {
        return helloWorld;
    }
}