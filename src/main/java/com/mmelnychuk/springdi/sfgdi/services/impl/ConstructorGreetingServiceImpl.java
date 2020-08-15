package com.mmelnychuk.springdi.sfgdi.services.impl;

import com.mmelnychuk.springdi.sfgdi.services.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello world! - Constructor";
    }

}
