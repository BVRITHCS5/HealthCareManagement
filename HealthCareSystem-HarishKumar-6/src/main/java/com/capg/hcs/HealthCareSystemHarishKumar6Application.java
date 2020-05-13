package com.capg.hcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan(basePackages= {"com.capg.hcs"})
@Configuration
@EntityScan("com.capg.hcs.entity")
@EnableSwagger2

@SpringBootApplication

public class HealthCareSystemHarishKumar6Application {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareSystemHarishKumar6Application.class, args);
	}
	
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2).select()                                  
          .apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot")))              
                                   
          .build();                                           
    }


}
