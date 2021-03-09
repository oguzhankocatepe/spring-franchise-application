package com.han;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFranchiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFranchiseApplication.class, args);
	}
	
	/*
	@Bean
    CommandLineRunner init(ApplicationRepository repo) {
        return args -> {
            Stream.of("Ahmet", "Hasan", "Muhammed", "Ali", "Ayse").forEach(name -> {
            	Application application = new Application(name, name.toLowerCase() + "@email.com");
            	repo.save(application);
            });
            repo.findAll().forEach(System.out::println);
        };
    }
    */

}
