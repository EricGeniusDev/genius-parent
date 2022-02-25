package com.genius.estoque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.genius")
public class EstoqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstoqueApplication.class, args);
	}

}
