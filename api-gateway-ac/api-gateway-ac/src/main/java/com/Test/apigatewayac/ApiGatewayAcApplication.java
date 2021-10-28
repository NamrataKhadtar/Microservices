package com.Test.apigatewayac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApiGatewayAcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayAcApplication.class, args);
	}

}
