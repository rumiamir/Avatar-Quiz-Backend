package com.example.Avatar.Quiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AvatarQuizApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvatarQuizApplication.class, args);
	}

}
