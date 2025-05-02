package in.kp.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.kp.entity.Student;
import in.kp.resources.SpringConfigFile;
import in.kp.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Spring Data JPA!" );
        
        Student std = new Student();
        std.setId(13);
        std.setEmail("Rahul@gmail.com");
        std.setName("Rahul Pawar");
        
        
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        
        StudentService studentService = (StudentService) context.getBean("studentService");
        studentService.insertDetailService(std);
        //studentService.updateDetailsService(12, "xyz@gmail.com");
       // studentService.deleteDetailService(12);
        
        //retrive details
       Student std1= studentService.getDetailService(12);
      System.out.println("ID: "+std1.getId() + "\nName: "+ std1.getName() + "\nEmail: "+ std1.getEmail() );
       
      
      //retrive all data 
     List<Student> allStd=  studentService.getAllDetailsService();
     	
     System.out.println("\n All Students Information ----\n ");
     for(Student stud : allStd) {
    	 System.out.println("ID: "+stud.getId() + "\nName: "+ stud.getName() + "\nEmail: "+ stud.getEmail() );
         
    	 
     }
        
    }	
}
