/*
 * Created 2020, 8, 28
 * by Maryna Melnychuk
 */

package com.mmelnychuk.springdi.sfgdi.config;

import com.mmelnychuk.springdi.sfgdi.beanexamples.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${db.username}")
    String userName;
    @Value("${db.password}")
    String password;
    @Value("${db.dburl}")
    String databaseUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setDatabaseUrl(databaseUrl);
        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }


}
