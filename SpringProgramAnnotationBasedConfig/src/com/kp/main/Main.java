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
		
		System.out.println("using Annotation based Configuration....");
		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.register(Student.class);
		context.refresh();
		
		
		Student std= (Student) context.getBean("stdObj");
		std.display();
		
		
		

}
}
