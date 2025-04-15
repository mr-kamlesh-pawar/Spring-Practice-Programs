package in.kp.main;

import java.sql.Connection;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.kp.beans.Information;
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
    	JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("myJdbcTemplate");
    
    	
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
    	
    	int id=754;
    	String name= "Om";
    	String college= "RMD";
    	
    	// ------------way 2---------------------
    	
//    	String query = "insert into t1 values(?,?,?)";
//    	int count= jdbcTemplate.update(query, id, name, college);
//    	
//    	if(count >0) {
//    		System.out.println("User inserted Sucessfully");
//    	} else {
//    		System.out.println("User not inserted due to error");
//    	}
//    	
    	
    	
    	//---------------//way 03 - using Object array -----------------------------------------------------------
    	
//     	String query = "insert into t1 values(?,?,?)";
//    	int count= jdbcTemplate.update(query, new Object[]  {id, name, college});
//    	
//    	if(count >0) {
//    		System.out.println("User inserted Sucessfully");
//    	} else {
//    		System.out.println("User not inserted due to error");
//    	}
//    	
    	
    	String sql= "insert into t1 values(?,?,?)";
    	Information info = context.getBean(Information.class);
    	int count= jdbcTemplate.update(sql, info.getId(), info.getName(), info.getCollege());
    	
    	if(count >0) {
    		System.out.println("User inserted Sucessfully");
    	} else {
    		System.out.println("User not inserted due to error");
    	}
    	
    	
    	
    	//select query
    	int id1= 454;
    	String sql_query= "select * from t1 where id=?";
    	Map<String, Object> map =jdbcTemplate.queryForMap(sql_query, id1);
    	System.out.println(map);
  	   	
    	
    	
    	
    	
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
