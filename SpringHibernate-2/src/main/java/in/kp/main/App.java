package in.kp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.kp.beans.Student;
import in.kp.dao.StudentDao;
import in.kp.resources.SpringConfigFile;

public class App 
{
    public static void main( String[] args )
    
    
    {
    	Student std=  new Student();
    	std.setId(6);
    	std.setCity("Malegaon");
    	std.setName("KP");
    	
   
    	ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
    	
    	StudentDao stdDao = (StudentDao) context.getBean("stdDaoImpBean");
    	//stdDao.addStudentDetails(std);
    	
    	// stdDao.updateStudentDetails(std);
    	//stdDao.deleteStudentDetails(std);
    	
    	stdDao.showStudentDetails(6);
    	
    	
    	
    	
    }
}
