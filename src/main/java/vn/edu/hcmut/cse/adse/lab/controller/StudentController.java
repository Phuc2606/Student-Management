package vn.edu.hcmut.cse.adse.lab.controller;

import org.springframework.web.bind.annotation.*;

import vn.edu.hcmut.cse.adse.lab.entity.Student;
import vn.edu.hcmut.cse.adse.lab.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable String id) {
        return service.getById(id);
    }

    @GetMapping("/search")
    public List<Student> searchByName(@RequestParam String name) {
        return service.searchByName(name);
    }
}
