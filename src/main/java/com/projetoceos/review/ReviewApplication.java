package com.projetoceos.review;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EntityScan
@SpringBootApplication
@EnableFeignClients
public class ReviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReviewApplication.class, args);
	}

}
