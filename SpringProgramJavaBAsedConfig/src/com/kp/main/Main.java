package com.kp.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.kp.beans.Student;
import com.kp.resources.SpringConfigFile;



public class Main {
	public static void main(String[] args) {
		
		System.out.println("using Java based Configuration....");
		
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std1= (Student) context.getBean("stdObj1");
		std1.display();
		
		System.out.println("-----------------------------------------");
		
		Student std2= (Student) context.getBean("stdObj2");
		std2.display();
		
		

}
}
