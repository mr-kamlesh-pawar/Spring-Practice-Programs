package in.kp.main;

import java.security.spec.NamedParameterSpec;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.kp.resources.SpringConfigFile;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", 567);
        map.put("name", "Atharva");
        map.put("college", "VIT"); 	
    	  	
    	
        NamedParameterJdbcTemplate nmParaJdbcTemplate = context.getBean(NamedParameterJdbcTemplate.class);
        
        String query = "insert into t1 values(:id, :name, :college)";
        int count= nmParaJdbcTemplate.update(query, map);
    	
    	if(count >0) {
    		System.out.println("User inserted Sucessfully");
    	} else {
    		System.out.println("User not inserted due to error");
    	}
    	
    	
    	
    	System.out.println("Success");
    	
    	
    
    }
}
