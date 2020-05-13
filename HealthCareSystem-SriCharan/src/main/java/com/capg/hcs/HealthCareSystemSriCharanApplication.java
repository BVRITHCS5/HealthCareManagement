package com.capg.hcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.google.common.base.Predicates;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan(basePackages= {"com.capg.hcs"})
@EnableSwagger2
@EntityScan("com.capg.hcs.entity")
@EnableAutoConfiguration
@SpringBootApplication
public class HealthCareSystemSriCharanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareSystemSriCharanApplication.class, args);
		System.out.println("Spring boot application started");
	}@Bean
	public Docket api() {
	return new Docket(DocumentationType.SWAGGER_2)
					.select()
					.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))
					
				.build();
}
}
