package com.cjavaperu.springboot.app.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@RibbonClient(name="servicio-productos")
//@EnableFeignClients
//@SpringBootApplication

@EnableCircuitBreaker
@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class CjavaSpringbootServicioItemRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CjavaSpringbootServicioItemRibbonApplication.class, args);
	}

}
