package com.desafio.spring.desafiospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
public class DesafioSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioSpringBootApplication.class, args);
	}
	
	
	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI().info(new Info()
				.title("Api Desafio Spring boot - Previred")
				.version("3.0.3")
				.description("Aplicación construida para el desafío previred")
				.termsOfService("https://swagger.io/terms")
				.license(new License().name("Apache 2.0").url("http://springdoc.org"))
		);
	}

}
