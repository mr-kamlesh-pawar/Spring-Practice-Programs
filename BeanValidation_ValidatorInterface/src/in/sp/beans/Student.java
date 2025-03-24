package in.sp.beans;

public class Student {
	private int rollno;
	private String name;
	private String phone;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Roll no : "+rollno);
		System.out.println("Phone no: "+phone);
	
	}
	

}
