package in.sp.validators;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import in.sp.beans.Student;

public class StudentValidator  implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		boolean b= Student.class.equals(clazz);
		return b;
	}

	@Override
	public void validate(Object target, Errors errors) {
		Student std= (Student) target;
		
		if(std.getName().equals("") || std.getName().equals("null")) {
			errors.rejectValue("name", "name_key", "Name is not valid");
						
		}
		
		if(std.getRollno()<=0) {
			errors.rejectValue("rollno", "roll_key", "Roll no is less than 0");
			
		}
		
		if(std.getPhone().length() != 10) {
			errors.rejectValue("phone", "phone_key", "Phone no is not valid");
			
		}
		
		
		
	}
	

}
