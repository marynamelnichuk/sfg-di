package com.mmelnychuk.springdi.sfgdi;

import com.mmelnychuk.springdi.sfgdi.beanexamples.FakeDataSource;
import com.mmelnychuk.springdi.sfgdi.beanexamples.FakeDataSourceApp;
import com.mmelnychuk.springdi.sfgdi.beanexamples.FakeJmsBroker;
import com.mmelnychuk.springdi.sfgdi.beanexamples.FakeSource;
import com.mmelnychuk.springdi.sfgdi.controllers.*;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.util.RouteMatcher;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("-----------I18nController------------");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());

		System.out.println("-----------PrimaryBean------------");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());

		System.out.println("-----------PropertyInjectedController------------");
		PropertyInjectedController propertyInjectedController
				= (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-----------SetterInjectedController------------");
		SetterInjectedController setterInjectedController
				= (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----------ConstructorInjectedController------------");
		ConstructorInjectedController constructorInjectedController
				= (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("-----------------Properties of FakeDataSource-------------------");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println("username: " + fakeDataSource.getUserName());
		System.out.println("password: " + fakeDataSource.getPassword());
		System.out.println("databaseUrl: " + fakeDataSource.getDatabaseUrl());

		System.out.println("-----------------Properties of FakeJmsBroker-------------------");
		FakeJmsBroker fakeJmsBroker = ctx.getBean(FakeJmsBroker.class);
		System.out.println("Jms username: " + fakeJmsBroker.getUserName());
		System.out.println("Jms password: " + fakeJmsBroker.getPassword());
		System.out.println("Jms databaseUrl: " + fakeJmsBroker.getDatabaseUrl());

		System.out.println("-----------------Properties of FakeDataSourceApp-------------------");
		FakeDataSourceApp fakeDataSourceApp = ctx.getBean(FakeDataSourceApp.class);
		System.out.println("App username: " + fakeDataSourceApp.getUserName());
		System.out.println("App password: " + fakeDataSourceApp.getPassword());
		System.out.println("App databaseUrl: " + fakeDataSourceApp.getDatabaseUrl());
	}

}
