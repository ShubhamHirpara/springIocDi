package com.example.spring04032024;

import com.example.spring04032024.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring04032024Application {

    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//
//        BMW bmw = context.getBean("X5",BMW.class);
//        BMW bmw1 = context.getBean("X5",BMW.class);
//        BMW bmw2 = context.getBean("X5",BMW.class);
//        BMW bmw3 = context.getBean("X5",BMW.class);
//        BMW bmw4 = context.getBean("X5",BMW.class);
//        System.out.println(bmw);
//        System.out.println(bmw1);
//        System.out.println(bmw2);
//        System.out.println(bmw3);
//        System.out.println(bmw4);
//
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
//        BMW bmeBean = context1.getBean(BMW.class);
//        System.out.println(bmeBean);


        ApplicationContext applicationContext = SpringApplication.run(Spring04032024Application.class, args);
        Student student = applicationContext.getBean(Student.class);
        System.out.println(student);
        Address address = applicationContext.getBean(Address.class);
        System.out.println(address);

    }

}
