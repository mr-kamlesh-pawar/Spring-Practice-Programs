package com.kp.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.kp.beans.Student;



public class Main {
	public static void main(String[] args) {
		
		System.out.println("This is first spring program.....");
		
		Resource resource= new ClassPathResource("/com/kp/resources/applicationContext.xml");
		BeanFactory container= new XmlBeanFactory(resource);
		
		//get bean obj
		Student std= (Student) container.getBean("stdObj");
		std.display();
	}

}
