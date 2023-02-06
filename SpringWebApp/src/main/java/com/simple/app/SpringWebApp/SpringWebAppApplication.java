package com.simple.app.SpringWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
@ComponentScan(basePackages = "com.simple.app")
@EntityScan(basePackages = "com.simple.app.entities" )
@EnableJpaRepositories(basePackages = "com.simple.app.repositories")
public class SpringWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebAppApplication.class, args);
	}

}
