package com.mmelnychuk.springdi.sfgdi.controllers;

import com.mmelnychuk.springdi.sfgdi.services.impl.ConstructorGreetingServiceImpl;
import com.mmelnychuk.springdi.sfgdi.services.impl.SetterGreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new SetterInjectedController();
        controller.setGreetingService(new SetterGreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        Assertions.assertEquals(controller.getGreeting(), "Hello world! - Setter");
    }
}