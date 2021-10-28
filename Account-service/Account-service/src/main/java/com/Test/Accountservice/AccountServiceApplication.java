package com.Test.Accountservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

}
/*
eureka:
	 client:
	  register-with-eureka: true
	  fetch-registry: true
	  service-url:
	   defaultZone: http://localhost:8761/eureka/
	 instance:
	  hostname: localhost
*/