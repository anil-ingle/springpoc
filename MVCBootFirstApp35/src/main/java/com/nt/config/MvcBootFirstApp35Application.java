package com.nt.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class MvcBootFirstApp35Application {

	public static void main(String[] args) {
		System.out.println("MBFAA::main(-)");
		SpringApplication.run(MvcBootFirstApp35Application.class, args);
	}
}
