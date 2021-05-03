package com.example.Zdarova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZdarovaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZdarovaApplication.class, args);

		Test test = new Test();
		test.page();
		test.display();

	}

}
