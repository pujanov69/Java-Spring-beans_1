package com.Spring_Bean_Exercise;


import com.Spring_Bean_Exercise.mybean.Bean3;
//import org.assertj.core.api.Assertions;
import com.Spring_Bean_Exercise.task2.beans.Person;
import org.junit.jupiter.api.Assertions;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class Task2Tests {

    @Autowired
    ApplicationContext applicationContext;


    private static final String NAME_1="Jack James";
    private static final String NAME_2="Hill Downhill";

     Person person1 = new Person();
     Person person2 = new Person();

    @Test
    void testSingleton(){
        Person person1 = applicationContext.getBean("person",Person.class);
        Person person2 = applicationContext.getBean("person", Person.class);
        person1.setName(NAME_1);
        System.out.println("Inside Singleton Test: " + person1.getName() + " " + person2.getName());
        Assertions.assertEquals(person1.getName(),person2.getName());
        person2.setName(NAME_2);
        System.out.println("Inside Singleton Test: " + person2.getName() + " " + person2.getName());
        Assertions.assertEquals(person1.getName(),person2.getName());
    }

    @Test
    void testPrototype(){
        Person person1 = applicationContext.getBean("person", Person.class);
        Person person2 = applicationContext.getBean("person", Person.class);
        person1.setName(NAME_1);
        System.out.println("Inside Prototype Test: " + person1.getName() + " " + person2.getName());
        Assertions.assertEquals(person1.getName(),person1.getName());
        person2.setName(NAME_2);
        Assertions.assertEquals(person1.getName(),person2.getName());
        System.out.println("Inside Prototype Test: " + person1.getName() + " " + person2.getName());

    }

}
