package in.kp.main;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/kp/resources/applicationContext.xml");
    	JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplateBean");
    
    	
    	try {
    	
    	Connection con = jdbcTemplate.getDataSource().getConnection();
    	
    	if(con != null) {
    		System.out.println("Database Connected Sucessfully...");
    		
    	} else {
    		System.out.println("Database Connection Problem...");
    	}
    	
    	}
    	catch (Exception e) {
			// TODO: handle exception
    		e.printStackTrace();
    		
		}
    	System.out.println("Success");
    	
    	
    	
    	//Above Configurations we can provide using XML or JAVA configuration
    	
//    	DriverManagerDataSource dataSource= new DriverManagerDataSource();
//    	dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//    	dataSource.setUrl("jdbc:mysql://localhost:3306/kpawar");
//    	dataSource.setUsername("root");
//    	dataSource.setPassword("root");
//    	
//    	JdbcTemplate jdbcTemplate = new JdbcTemplate();
//    	jdbcTemplate.setDataSource(dataSource);
    }
}
