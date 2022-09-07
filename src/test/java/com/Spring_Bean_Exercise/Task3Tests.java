package com.Spring_Bean_Exercise;

import com.Spring_Bean_Exercise.task3.BeanClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Task3Tests {


    @Test
    void testTask3(@Autowired BeanClass beanClass){
        beanClass.setMessage("setBeanName executed");

        Assertions.assertEquals("setBeanName executed", beanClass.getMessage());
    }
}
