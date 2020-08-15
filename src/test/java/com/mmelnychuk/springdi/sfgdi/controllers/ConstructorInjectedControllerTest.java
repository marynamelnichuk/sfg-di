package com.mmelnychuk.springdi.sfgdi.controllers;

import com.mmelnychuk.springdi.sfgdi.services.impl.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        Assertions.assertEquals(controller.getGreeting(), "Hello world! - Constructor");
    }
}