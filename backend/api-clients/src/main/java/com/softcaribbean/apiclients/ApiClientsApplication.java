package com.softcaribbean.apiclients;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.softcaribbean.apiclients"})
@EntityScan("com.softcaribbean.apiclients")
@EnableJpaRepositories("com.softcaribbean.apiclients")
public class ApiClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiClientsApplication.class, args);
	}

}
