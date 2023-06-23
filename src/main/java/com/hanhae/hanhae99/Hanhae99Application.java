package com.hanhae.hanhae99;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class Hanhae99Application {

	public static void main(String[] args) {
		SpringApplication.run(Hanhae99Application.class, args);
	}

}
