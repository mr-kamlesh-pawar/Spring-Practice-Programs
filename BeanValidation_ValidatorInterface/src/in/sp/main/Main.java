package in.sp.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.DataBinder;
import org.springframework.validation.ObjectError;

import in.sp.beans.Student;
import in.sp.validators.StudentValidator;

public class Main {
	public static void main(String[] args) {
		System.out.println("Bean Validation using Validator Interface ");
		
		
		ApplicationContext contex = new ClassPathXmlApplicationContext("/in/sp/resources/applicationContext.xml");
		Student std= (Student) contex.getBean("stdID");
		
		DataBinder databinder= new DataBinder(std);
		databinder.addValidators(new StudentValidator());
		
		databinder.validate(); // first invoked supports method
		
		List<ObjectError> list = databinder.getBindingResult().getAllErrors();
		
		
		if(list.isEmpty()) {
			std.display();
		}
		else {
			for(ObjectError oe: list) {
				System.err.println(oe.getDefaultMessage());
			}
		}
	}
	
	
}
