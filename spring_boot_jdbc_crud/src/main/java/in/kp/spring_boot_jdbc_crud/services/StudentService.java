package in.kp.spring_boot_jdbc_crud.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.kp.spring_boot_jdbc_crud.model.Student;
import in.kp.spring_boot_jdbc_crud.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public int addStudent(Student student) {
        return repository.saveStudent(student);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.findById(id);

    }

    public int updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    public int deleteStudent(int id) {
        return repository.deleteStudent(id);
    }

}