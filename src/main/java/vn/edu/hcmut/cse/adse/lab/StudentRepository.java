package vn.edu.hcmut.cse.adse.lab;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {
    // Tự động có các hàm CRUD cơ bản
}
