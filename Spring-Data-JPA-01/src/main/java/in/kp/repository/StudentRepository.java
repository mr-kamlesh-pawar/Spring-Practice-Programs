package in.kp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.kp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
