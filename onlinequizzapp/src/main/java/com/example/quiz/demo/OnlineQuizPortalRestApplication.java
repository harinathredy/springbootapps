package com.example.quiz.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication(scanBasePackages = "com.example.quiz")
@EntityScan("com.example.quiz.bean")
@EnableJpaRepositories("com.example.quiz.repository")
public class OnlineQuizPortalRestApplication {
public static void main(String[] args) {
SpringApplication.run(OnlineQuizPortalRestApplication.class, args);
}
}
