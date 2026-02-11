package vn.edu.hcmut.cse.adse.lab.service;

import org.springframework.stereotype.Service;

import vn.edu.hcmut.cse.adse.lab.entity.Student;
import vn.edu.hcmut.cse.adse.lab.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repository;

    public List<Student> getAll() {
        return repository.findAllOrderByIdAsNumber();
    }

    public Student getById(String id) {
        return repository.findById(id).orElse(null);
    }
    public List<Student> searchByName(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }
    public void saveStudent(Student student) {
        repository.save(student);
    }
    public void delete(String id) {
        repository.deleteById(id);
    }
    public boolean existsById(String id) {
        return repository.existsById(id);
    }
}
