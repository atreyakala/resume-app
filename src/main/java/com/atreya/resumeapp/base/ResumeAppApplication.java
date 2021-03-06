package com.atreya.resumeapp.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.atreya.resumeapp.*")
public class ResumeAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(ResumeAppApplication.class, args);
  }

}
