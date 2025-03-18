package com.kp.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
@Component("stdObj")
public class Student {
	@Value("Kamlesh")
	private String name;
	
	@Value("55")
	private int rollno;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("Student Name is :"+ name + "\n Student Roll no: "+ rollno);
		
	}

}
