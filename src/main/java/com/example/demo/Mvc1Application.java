package com.example.demo;
//defaut 8080
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mvc1Application {		//(model and view controller)  this is used for write front and backend at same place

	public static void main(String[] args) {
		SpringApplication.run(Mvc1Application.class, args);
	}

}
