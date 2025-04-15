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

import in.kp.beans.Student;
import in.kp.resources.SpringConfigFile;
import in.kp.services.StudentService;
import in.kp.services.StudentServiceImpl;


public class App 
{
    public static void main( String[] args ) 
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        Student std=  context.getBean(Student.class);
        
        StudentService stdService = context.getBean(StudentServiceImpl.class);
        boolean status= stdService.addStdDetailsService(std);
        
        if(status) {
        	System.out.println("Success");
        }
        else {
        	System.out.println("Fail");
        }
       
    	
    	
    	
    	
    
    }
}
