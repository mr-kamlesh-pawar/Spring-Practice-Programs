package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Address;
import in.sp.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddObj() {
		Address address= new Address();
		address.setCity("Malegaon");
		address.setHouseno(451);
		address.setPincode(451245);
		
	
	return address;
	}
	
	
	@Bean
	public Student createstdObj() {
		Student std= new Student();
		
		std.setName("Kamlesh");
		std.setRollno(45);
		std.setAddress(createAddObj());
		return std;
	}
	

}
