package in.kp.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.kp.beans.Employee;
import in.kp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
//       Employee emp = new Employee();
//       emp.setId(1);
//       emp.setCity("Mumbai");
  
       
       // Configuration
       Configuration cfg = new Configuration();
       cfg.configure("/in/kp/resources/hibernate.cfg.xml");
       
       SessionFactory sf=  cfg.buildSessionFactory();
       
       Session session = sf.openSession();
       
       Transaction transaction = session.beginTransaction();
       try {
    	   
    	   //Update Part
    	   	
//    	   Employee emp = new Employee();
//    	   emp.setId(2);
//    	   emp.setName("Abhi");
//    	   emp.setEmail("ab@xyz.com");
//    	   emp.setCity("Saundane");
//    	   session.saveOrUpdate(emp);
//    	       	   
//    	   System.out.println("Success");
//    	   
    	   
    	   
    	   //Delete Part
    	   
    	   Employee emp = new Employee();
    	   emp.setId(1);
    	   
    	   session.delete(emp);
    	   System.out.println("Success...");
    	   
    	   
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
