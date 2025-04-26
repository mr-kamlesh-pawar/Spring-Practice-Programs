package in.kp.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import in.kp.beans.Student;
import org.springframework.transaction.annotation.Transactional;


public class StudentDaoImpl  implements StudentDao {
	
	
	
	private HibernateTemplate hibernateTemplate;
	

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	@Override
	public void addStudentDetails(Student std) {
		// TODO Auto-generated method stub
		
		try {
			hibernateTemplate.save(std);
			System.out.println("Student details Inserted");
			
		} catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}

	@Transactional
	@Override
	public void updateStudentDetails(Student std) {
		// TODO Auto-generated method stub
		

		try {
			hibernateTemplate.update(std);
			System.out.println("Student details Updated");
			
		} catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
		
	}

	@Transactional
	@Override
	public void deleteStudentDetails(Student std) {
		// TODO Auto-generated method stub
		

		try {
			hibernateTemplate.delete(std);
			System.out.println("Student details Deleted");
			
		} catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
		
	}

	
	@Override
	public void showStudentDetails(int id) {
		// TODO Auto-generated method stub
		

		try {
			Student std1= (Student) hibernateTemplate.get(Student.class, id);
			System.out.println("Student details Are: ");
			System.out.println("Id: "+ std1.getId() + "\n Name: " + std1.getName());
			
		} catch(Exception e) {
			System.out.println("Fail");
			e.printStackTrace();
		}
		
	}


	
	

}
