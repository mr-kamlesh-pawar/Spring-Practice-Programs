package in.kp.beans;


import javax.persistence.*;

@Entity
@Table(name ="std")
public class Student {
	
	@Id
	private int id;
	
	@Column(name= "std_name")
	private String name;
	
	@Column(name = "std_city")
	private String city;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
