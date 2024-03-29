package com.example.demo;

import com.example.demo.Service.CustomerService;
import com.example.demo.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// Holen des Beispiel-Service aus dem Kontext
		//ExampleUsageService exampleUsageService = context.getBean(ExampleUsageService.class);
		//UserService userService = context.getBean(UserService.class);
		CustomerService customerService = context.getBean(CustomerService.class);
		customerService.AddCustomer();
		UserService userService = context.getBean(UserService.class);
		userService.AddUser();

		//userService.AddUser();
		// Aufrufen der Methode, um einen neuen Kunden hinzuzufügen
		//exampleUsageService.addNewCustomer();

		// Beende den Spring Boot-Kontext
		//context.close();
	}
}
