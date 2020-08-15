package com.mmelnychuk.springdi.sfgdi.controllers;

import com.mmelnychuk.springdi.sfgdi.services.impl.ConstructorGreetingServiceImpl;
import com.mmelnychuk.springdi.sfgdi.services.impl.PropertyGreetingServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService = new PropertyGreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        Assertions.assertEquals(controller.getGreeting(), "Hello world! - Property");
    }


}