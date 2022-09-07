package com.Spring_Bean_Exercise.task3;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanClass implements BeanNameAware, ApplicationContextAware, BeanFactoryAware, InitializingBean, DisposableBean {
    private String message;

    @Bean
    BeanClass beanClass(){
        return new BeanClass();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("--- setBeanFactory executed ---");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("--- setBeanName executed ---");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("--- destroy executed ---");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("--- afterPropertiesSet executed ---");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("--- setApplicationContext executed ---");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("--- postConstruct executed ---");

    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("--- PreDestroy executed ---");

    }
}
