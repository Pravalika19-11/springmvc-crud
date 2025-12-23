package com.example.studentcrud.controller;



import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.studentcrud.entity.Student;
import com.example.studentcrud.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    // READ - All
    @GetMapping
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // READ - By ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Integer id) {
        return service.getStudentById(id);
    }

    // UPDATE
    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        service.deleteStudent(id);
        return "Student deleted successfully";
    }
}
