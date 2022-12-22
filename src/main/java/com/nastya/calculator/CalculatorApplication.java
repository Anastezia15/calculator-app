package com.nastya.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
		int a=24;
		a +=23;

		Abracadabra wichViolet=new Abracadabra(5,9,0);
		System.out.println(wichViolet.spell());
	}

}

