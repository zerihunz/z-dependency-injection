package zguru.springframework.zdependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zguru.springframework.zdependencyinjection.controllers.*;

@SpringBootApplication
public class ZDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ZDependencyInjectionApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		//Here the spring framework is in control of creating the MyController object and passing an instance
		//Notice how we never instantiated the MyController class.
		//The is the principle of inversion of control, the framework is doing the work of managing the creation of
		//Objects
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("--------------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("---------------Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("---------------Setter");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------------Constructor");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
