package com.example.studentcrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.studentcrud.entity.Student;
import com.example.studentcrud.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    // CREATE or UPDATE
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    // READ - All
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    // READ - By ID
    public Student getStudentById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    // DELETE
    public void deleteStudent(Integer id) {
        repository.deleteById(id);
    }
}