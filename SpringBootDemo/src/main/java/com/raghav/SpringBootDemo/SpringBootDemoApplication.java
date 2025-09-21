package com.raghav.SpringBootDemo;

import com.raghav.SpringBootDemo.model.Alien;
import com.raghav.SpringBootDemo.model.Laptop;
import com.raghav.SpringBootDemo.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		LaptopService service = context.getBean(LaptopService.class);

		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
		lap.compile();


//		Alien obj = context.getBean(Alien.class);
//		obj.code();
//		System.out.println(obj.getAge());

//		Alien obj1 = context.getBean(Alien.class);
//		obj1.code();
//
//		System.out.println(obj1.hashCode()==obj.hashCode()); --> returns true as both the objects are same created by the IOC

//		System.out.println("Hello World!");
	}

}
