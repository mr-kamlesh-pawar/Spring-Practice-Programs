package com.kp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kp.beans.Student;

@Configuration
public class SpringConfigFile {
	
//	@Bean
//	public Student stdObj() {
//		Student std = new Student();
//		
//		std.setName("Kamlesh");
//		std.setRollno(96);
//		
//		return std;
//	}
	
	
	@Bean(name = "stdObj1")
	public Student createBeanObj1() {
		Student std = new Student();
		
		std.setName("Kamlesh");
		std.setRollno(96);
		
		return std;
	}
	
	
	@Bean(name = "stdObj2")
	public Student createBeanObj2() {
		Student std = new Student();
		
		std.setName("Rahul");
		std.setRollno(46);
		
		return std;
	}
	

}
