package com.demo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMain {
	public static void main(String[] args) {
		SpringApplication.run(DemoMain.class, "--server.port=8080");
	}
}
