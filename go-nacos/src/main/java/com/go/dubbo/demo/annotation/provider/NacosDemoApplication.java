package com.go.dubbo.demo.annotation.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.go")
public class NacosDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NacosDemoApplication.class, args);
	}

}
