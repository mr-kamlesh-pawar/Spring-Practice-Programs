package com.kp.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.kp.beans.Student;



public class Main {
	public static void main(String[] args) {
		
		System.out.println("This is first spring program.....  using ApplicationContext");
		
		ApplicationContext container= new ClassPathXmlApplicationContext("/com/kp/resources/applicationContext.xml");
		
		//get bean obj
		Student std= (Student) container.getBean("stdObj");
		std.display();
	}

}
