package com.Test.serviceregistryac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryAcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistryAcApplication.class, args);
	}

}
