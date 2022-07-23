package com.rodrigo.estudo_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EstudoSpringBootApplication {

	@GetMapping ("/Ola")
	public String olaMundo(){
		return "Ola ,Mundo!";
	}

	public static void main(String[] args) {
		SpringApplication.run(EstudoSpringBootApplication.class, args);
	}

}
