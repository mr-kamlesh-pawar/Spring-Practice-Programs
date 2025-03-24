package in.kamlesh.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.kamlesh.beans.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World! Project Starts" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("/in/kamlesh/resources/applicationContext.xml");
        Student std= (Student) context.getBean("stdObj");
        
        std.display();
        System.out.println("Project ends");
    }
}
