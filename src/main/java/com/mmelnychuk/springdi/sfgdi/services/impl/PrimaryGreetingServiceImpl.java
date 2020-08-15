package com.mmelnychuk.springdi.sfgdi.services.impl;

import com.mmelnychuk.springdi.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World!";
    }
}
