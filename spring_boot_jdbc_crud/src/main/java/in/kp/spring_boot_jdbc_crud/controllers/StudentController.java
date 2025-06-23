package in.kp.spring_boot_jdbc_crud.controllers;

import org.springframework.web.bind.annotation.RestController;

import in.kp.spring_boot_jdbc_crud.model.Student;
import in.kp.spring_boot_jdbc_crud.services.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/")
    public String check() {
        return "Hello World";
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id) {
        Student std= service.getStudentById(id);
        if (std == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Record Not Found"+id);
            
        }
        return ResponseEntity.ok(std);
    }

    @GetMapping("/get-all")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    @PostMapping("/add-student")
    public int addStudent(@RequestBody Student student) {
        return service.addStudent(student);
    }

    @PutMapping("/update-student")
    public int updateStudent(@RequestBody Student student){
            return service.updateStudent(student);
    }

    @DeleteMapping("/delete-student/{id}")
    public int deleteStudent(@PathVariable int id){
        return service.deleteStudent(id);
    }

}
