package tech.gonzalezfernando.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import tech.gonzalezfernando.didemo.controllers.ConstructorInjectedController;
import tech.gonzalezfernando.didemo.controllers.MyController;
import tech.gonzalezfernando.didemo.controllers.PropertyInjectedController;
import tech.gonzalezfernando.didemo.controllers.SetterInjectedController;
import tech.gonzalezfernando.didemo.services.GreetingServiceImpl;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) ctx.getBean("myController");

        myController.hello();

        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }

}
