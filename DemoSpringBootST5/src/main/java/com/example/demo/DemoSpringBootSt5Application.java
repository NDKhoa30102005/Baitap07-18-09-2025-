package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.example.demo.Service.IStorageService;
import com.example.demo.config.StorageProperties;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class) // thêm cấu hình storage

public class DemoSpringBootSt5Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringBootSt5Application.class, args);
	}
	@Bean
	CommandLineRunner init(IStorageService storageService) {
		return (args -> {
		storageService.init();
		});
		


	}
}
