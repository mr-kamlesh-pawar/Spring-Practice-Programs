package in.sp.beans;

public class Student {
	private String name;
	private int rollno;
	private Address address;
	
	public Student(String name, int rollno, Address address) {
		this.name=name;
		this.rollno= rollno;
		this.address= address;
		
		// TODO Auto-generated constructor stub
	}

	
	public void display() {
		System.out.println("Name: "+name+ "\n Roll NO:" + rollno +"\nAdddress: "+address );
	}

}
