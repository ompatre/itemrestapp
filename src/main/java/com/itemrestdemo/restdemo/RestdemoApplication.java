package com.itemrestdemo.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.controller")
@EnableJpaRepositories({"com.dao"})
@EntityScan(basePackages="com.model")

public class RestdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestdemoApplication.class, args);
	}

}
