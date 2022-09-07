package com.Spring_Bean_Exercise;

import com.Spring_Bean_Exercise.mybean.Bean1;
import com.Spring_Bean_Exercise.mybean.Bean2;
import com.Spring_Bean_Exercise.mybean.Bean3;
import com.Spring_Bean_Exercise.mybean.MyBeanClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringBeanExerciseApplicationTests {
	@Autowired
	MyBeanClass myBeanClass;

	@Autowired
	public ApplicationContext applicationContext;

	@Test
	void contextLoads() {
	}

	@Test
	void appContextNotNull(){
		Assertions.assertNotNull(myBeanClass);
	}

	@Test
	void appContext_getByName(@Autowired Bean1 bean1){
		Assertions.assertEquals(bean1,applicationContext.getBean("bean1"));

	}

	@Test
	void appContext_getByType(@Autowired Bean2 bean2){
		Assertions.assertEquals(bean2,applicationContext.getBean(Bean2.class));
	}

	@Test
	void appContext_getByNameAndType(@Autowired Bean3 bean3){
		Assertions.assertEquals(bean3,applicationContext.getBean("bean3", Bean3.class));

	}
}
