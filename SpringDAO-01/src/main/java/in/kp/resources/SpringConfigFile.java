package in.kp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.kp.beans.Information;
import in.kp.beans.Student;
import in.kp.dao.StudentDao;
import in.kp.dao.StudentDaoImpl;
import in.kp.services.StudentService;
import in.kp.services.StudentServiceImpl;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public DriverManagerDataSource myDataSource() {
	
		DriverManagerDataSource dataSource= new DriverManagerDataSource();
    	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    	dataSource.setUrl("jdbc:mysql://localhost:3306/kpawar");
    	dataSource.setUsername("root");
    	dataSource.setPassword("root");
		
		
		return  dataSource;
				
	}
	
	@Bean
	public JdbcTemplate createJdbcTemplateObj() {
		JdbcTemplate jdbctemp = new JdbcTemplate();
		jdbctemp.setDataSource(myDataSource());
		
		return jdbctemp;
	}
	
	@Bean
	public StudentDaoImpl createStdDaoObj() {
		StudentDaoImpl stdDaoImpl = new StudentDaoImpl();
		stdDaoImpl.setJdbctemplate(createJdbcTemplateObj());
		return stdDaoImpl;
	}
	
	@Bean
	public StudentServiceImpl createStdServiceImplObj() {
		StudentServiceImpl studentDaoImpl = new StudentServiceImpl();
		studentDaoImpl.setStdDao(createStdDaoObj());
		
		return studentDaoImpl;
	}
	
	
	@Bean
	public Student createStdObj() {
		Student std= new Student();
		
		std.setId(111);
		std.setName("Joker");
		std.setCollege("ABCD");
		return std;
	}


}
