package com.example.infrastructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class InfrastructureApplication {

  public static void main(String[] args) {
    SpringApplication.run(InfrastructureApplication.class, args);
  }
}
