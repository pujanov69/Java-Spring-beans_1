package com.Spring_Bean_Exercise.task2.config;

import com.Spring_Bean_Exercise.task2.beans.Person;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Task2Config {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Person singletonPerson(){
        return new Person();
    }

    @Bean
    @Scope("prototype")
    Person prototypePerson(){
        return new Person();
    }
}
