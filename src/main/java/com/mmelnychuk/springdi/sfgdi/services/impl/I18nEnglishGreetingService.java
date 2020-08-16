/*
 * Created 2020, 8, 16
 * by Maryna Melnychuk
 */

package com.mmelnychuk.springdi.sfgdi.services.impl;

import com.mmelnychuk.springdi.sfgdi.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - English !";
    }
}
