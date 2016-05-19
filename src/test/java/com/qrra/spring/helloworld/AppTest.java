package com.qrra.spring.helloworld;

import com.qrra.spring.helloworld.HelloWorld;
import com.qrra.spring.helloworld.impl.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
    locations = {
        "classpath:beans.xml",
        "classpath:context.xml"
    })
public class AppTest {

    @Inject
    @Qualifier("springHelloWorld")
    private HelloWorld springHelloWorld;

    @Inject
    @Qualifier("javaeeHelloWorld")
    private HelloWorld javaeeHelloWorld;

    @Inject
    @Qualifier("chnHelloWorld")
    private HelloWorld chnHelloWorld;

    @Inject
    @Qualifier("engHelloWorld")
    private HelloWorld engHelloWorld;

    @Test
    public void testHello() {
        assertEquals(SpringHelloWorld.HELLO, springHelloWorld.sayHello());
        assertEquals(JavaEEHelloWorld.HELLO, javaeeHelloWorld.sayHello());
    }

    @Test
    public void testGreeting() {
        assertEquals(ChnHelloWorld.GREETING, chnHelloWorld.sayHello());
        assertEquals(EngHelloWorld.GREETING, engHelloWorld.sayHello());
    }
}