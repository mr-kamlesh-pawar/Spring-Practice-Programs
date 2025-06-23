package in.kp.spring_boot_jdbc_crud.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.kp.spring_boot_jdbc_crud.model.Student;

@Repository
public class StudentRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public int saveStudent(Student student) {
        return jdbcTemplate.update("insert into students (name,email)values(?,?)", student.getName(),
                student.getEmail());

    }

    public List<Student> findAll() {
        return jdbcTemplate.query("select * from students", new BeanPropertyRowMapper<>(Student.class));
    }

    public Student findById(int id) {
       try{
        return jdbcTemplate.queryForObject("select * from students where id=?",
                new BeanPropertyRowMapper<>(Student.class), id);

       } catch(Exception e){
        System.out.println(e.getMessage());
        return null;
       }
        

    }

    public int updateStudent(Student student) {

        return jdbcTemplate.update("update students set name=? , email=? where id=?", student.getName(),
                student.getEmail(), student.getId());
    }

    public int deleteStudent(int id) {
        try{
            return jdbcTemplate.update("delete from students where id=?", id);
        } catch(Exception e){
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
