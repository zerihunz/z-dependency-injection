package zguru.springframework.zdependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import zguru.springframework.zdependencyinjection.controllers.MyController;

@SpringBootApplication
public class ZDependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ZDependencyInjectionApplication.class, args);
		//Here the spring framework is in control of creating the MyController object and passing an instance
		//Notice how we never instantiated the MyController class.
		//The is the principle of inversion of control, the framework is doing the work of managing the creation of
		//Objects
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();

		System.out.println(greeting);
	}

}