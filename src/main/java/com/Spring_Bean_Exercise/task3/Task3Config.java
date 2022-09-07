package com.Spring_Bean_Exercise.task3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Configuration
public class Task3Config {

    @PostConstruct
    public void init(){
        System.out.println("--- initMethod executed ---");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("--- destroyMethod executed ---");
    }

    @Bean
    BeanClass beanClass(){
        return new BeanClass();
    }

    @Bean
    CustomBeanPostProcessor customBeanPostProcessor(){
        return new CustomBeanPostProcessor();
    }
}
