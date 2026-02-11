package vn.edu.hcmut.cse.adse.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import vn.edu.hcmut.cse.adse.lab.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
    List<Student> findByNameContainingIgnoreCase(String name);

    @Query(value = "SELECT * FROM students ORDER BY CAST(id AS INTEGER)", nativeQuery = true)
    List<Student> findAllOrderByIdAsNumber();

}
