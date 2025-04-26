package in.kp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



import in.kp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
        Student std = new Student();
        
       std.setId(2);
       std.setName("Siddhesh");
       std.setRollno(34);
       std.setGender("Male");
       std.setCity("Nashik");
       std.setEmail("sid@gmail.com");
       
       
       // Configuration
       Configuration cfg = new Configuration();
       cfg.configure("/in/kp/resources/hibernate.cfg.xml");
       
       SessionFactory sf=  cfg.buildSessionFactory();
       
       Session session = sf.openSession();
       
       Transaction transaction = session.beginTransaction();
       try {
    	   
    	   session.save(std);
    	   
    	   System.out.println("Success");
    	   
    	   transaction.commit();
       } catch (Exception e) {
    	   System.out.println("Fail");
    	   transaction.rollback();
    	   
    	   e.printStackTrace();
    	   
       }
       
       finally {
		session.close();
		sf.close(); 
	}
       
    
    }
    
}
