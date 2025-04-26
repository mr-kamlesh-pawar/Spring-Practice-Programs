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
//      // emp.setId(1);
//       emp.setName("Siddhesh");
//       emp.setCity("Pune");
//       emp.setEmail("sidd@gmail.com");
       
       
       // Configuration
       Configuration cfg = new Configuration();
       cfg.configure("/in/kp/resources/hibernate.cfg.xml");
       
       SessionFactory sf=  cfg.buildSessionFactory();
       
       Session session = sf.openSession();
       
     //  Transaction transaction = session.beginTransaction();
       try {
    	   
    	   //insert a recod
    	  // session.save(emp); also use session.persist(emp);
    	   
    	   
    	   //retrive a record from DB
    	   Employee emp = session.get(Employee.class, 1);
    	   
    	   System.out.println("ID: " + emp.getId());
    	   System.out.println("Name: " + emp.getName());
    	   System.out.println("Email: " + emp.getEmail());
    	   System.out.println("City: " + emp.getCity());
    	   
    	   
    	   System.out.println("Success");
    	   
    	  // transaction.commit();
       } catch (Exception e) {
    	   System.out.println("Fail");
    	//   transaction.rollback();
    	   
    	   e.printStackTrace();
    	   
       }
       
       finally {
		session.close();
		sf.close(); 
	}
       
    
    }
    
}
