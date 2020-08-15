package com.mmelnychuk.springdi.sfgdi;

import com.mmelnychuk.springdi.sfgdi.controllers.ConstructorInjectedController;
import com.mmelnychuk.springdi.sfgdi.controllers.MyController;
import com.mmelnychuk.springdi.sfgdi.controllers.PropertyInjectedController;
import com.mmelnychuk.springdi.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

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
	}

}
