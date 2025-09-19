package com.raghav.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

//		Alien obj = new Alien();
		Alien obj = context.getBean(Alien.class);
		obj.code();

//		Alien obj1 = context.getBean(Alien.class);
//		obj1.code();
//
//		System.out.println(obj1.hashCode()==obj.hashCode()); --> returns true as both the objects are same created by the IOC

//		System.out.println("Hello World!");
	}

}
