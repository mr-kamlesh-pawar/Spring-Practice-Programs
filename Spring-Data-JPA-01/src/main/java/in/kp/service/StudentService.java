package in.kp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kp.entity.Student;
import in.kp.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository stdRepository;

	public void insertDetailService(Student std) {

		try {

			stdRepository.save(std);
			System.out.println("\n Insertion Sucessfull");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Insertion Fail");
		}

	}
	
	public void updateDetailsService(int id, String email) {
		try {
			
			Optional< Student> optional = stdRepository.findById(id);
			Student std=  optional.get();
			std.setEmail(email);
			stdRepository.save(std);
			System.out.println("Email Updation Success");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Email updation Failed");
		}
	}
	
	public void deleteDetailService(int id) {

		try {

			stdRepository.deleteById(id);
			System.out.println("\n Deletion Sucessfull");
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Deletion Fail");
		}

	}
	
	public Student getDetailService(int id) {

		
			Optional<Student> optional = stdRepository.findById(id);

		    if (optional.isPresent()) {
		        Student std = optional.get();
		        System.out.println("\n Retrieve Info Successful");
		        return std;
		    } else {
		        System.out.println("Student with ID " + id + " not found.");
		        return null; // or throw custom exception if needed
		    }
			
		

	}
	
	public List<Student> getAllDetailsService(){
		
		return stdRepository.findAll();
	}

}
