package in.kp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.kp.beans.Information;

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
	public NamedParameterJdbcTemplate myNamedParaJdbcTemplate() {
		NamedParameterJdbcTemplate nm= new NamedParameterJdbcTemplate(myDataSource());
		
		return nm;
	}
	
	


}
