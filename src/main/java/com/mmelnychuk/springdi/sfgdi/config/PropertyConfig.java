/*
 * Created 2020, 8, 28
 * by Maryna Melnychuk
 */

package com.mmelnychuk.springdi.sfgdi.config;

import com.mmelnychuk.springdi.sfgdi.beanexamples.FakeDataSource;
import com.mmelnychuk.springdi.sfgdi.beanexamples.FakeDataSourceApp;
import com.mmelnychuk.springdi.sfgdi.beanexamples.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    @Autowired
    Environment env;

    @Value("${mmelnychuk.db.username}")
    String userName;
    @Value("${mmelnychuk.db.password}")
    String password;
    @Value("${mmelnychuk.db.dburl}")
    String databaseUrl;

    @Value("${mmelnychuk.jms.username}")
    String jmsUserName;
    @Value("${mmelnychuk.jms.password}")
    String jmsPassword;
    @Value("${mmelnychuk.jms.dburl}")
    String jmsDatabaseUrl;

    @Value("${mmelnychuk.app.proper.username}")
    String appUserName;
    @Value("${mmelnychuk.app.proper.password}")
    String appPassword;
    @Value("${mmelnychuk.app.proper.dburl}")
    String appDatabaseUrl;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUserName(userName); //env.getProperty("APP_USERNAME")
        fakeDataSource.setPassword(password);
        fakeDataSource.setDatabaseUrl(databaseUrl);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroken(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUserName(jmsUserName);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setDatabaseUrl(jmsDatabaseUrl);
        return fakeJmsBroker;
    }

    @Bean
    public FakeDataSourceApp fakeDataSourceApp(){
        FakeDataSourceApp fakeDataSourceApp = new FakeDataSourceApp();
        fakeDataSourceApp.setUserName(appUserName);
        fakeDataSourceApp.setPassword(appPassword);
        fakeDataSourceApp.setDatabaseUrl(appDatabaseUrl);
        return fakeDataSourceApp;
    }

    //HERE STATIC NECESSARILY СAUSE THAT METHOD IS OVERRIDE
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties() {
        return new PropertySourcesPlaceholderConfigurer();
    }

}
