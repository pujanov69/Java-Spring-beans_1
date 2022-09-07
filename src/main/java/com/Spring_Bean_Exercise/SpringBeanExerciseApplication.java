package com.Spring_Bean_Exercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBeanExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeanExerciseApplication.class, args);
	}


}

/*
	@Bean
	public CommandLineRunner run(ApplicationContext appContext) {
		return args -> {
			System.out.println();
			System.out.println("============================");
			System.out.println("Printing beans created by the Main applicationContext");
			System.out.println();

			// gets an array with the name of all beans created in the application context
			String[] beans = appContext.getBeanDefinitionNames();

			// sorts the array alphabetically and prints the name of each on the console
			Arrays.stream(beans).sorted().forEach(System.out::println);
		};
	}

* */