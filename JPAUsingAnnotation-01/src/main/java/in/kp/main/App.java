package in.kp.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import in.kp.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student std = new Student();
        std.setId(14);
        std.setName("Siddesh");
        std.setEmail("siddesh@gmail.com");
        std.setMarks(85.45f);
        
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("main-persistence-unit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        EntityTransaction entityTransaction = entityManager.getTransaction();
       
        try {
        	
        entityTransaction.begin();
        
        entityManager.persist(std);
        
        entityTransaction.commit();
        System.out.println("Success");
        
        } catch (Exception e) {
			// TODO: handle exception
        	entityTransaction.rollback();
        	e.printStackTrace();
        	System.out.println("Fail");
		}
        finally {
			entityManager.close();
			entityManagerFactory.close();
		}
    
    }
}
