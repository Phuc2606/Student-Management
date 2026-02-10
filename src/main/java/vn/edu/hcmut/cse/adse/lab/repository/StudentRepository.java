package vn.edu.hcmut.cse.adse.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import vn.edu.hcmut.cse.adse.lab.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
    // Tự động có các hàm CRUD cơ bản
    List<Student> findByNameContainingIgnoreCase(String name);
}
