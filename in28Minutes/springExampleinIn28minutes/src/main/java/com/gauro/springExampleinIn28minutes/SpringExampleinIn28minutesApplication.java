package com.gauro.springExampleinIn28minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gauro.springExampleinIn28minutes.web")
public class SpringExampleinIn28minutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringExampleinIn28minutesApplication.class, args);
	}

}
