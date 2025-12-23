package com.example.studentcrud.ui;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.studentcrud.entity.Student;
import com.example.studentcrud.service.StudentService;

@Controller
public class StudentUIController {

    private final StudentService service;

    public StudentUIController(StudentService service) {
        this.service = service;
    }

    // Home Page – List Students
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "index";
    }

    // Show Add Form
    @GetMapping("/addStudent")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    // Save Student
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student student) {
        service.saveStudent(student);
        return "redirect:/";
    }

    // Show Edit Form
    @GetMapping("/editStudent/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        model.addAttribute("student", service.getStudentById(id));
        return "edit-student";
    }

    // Delete Student
    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        service.deleteStudent(id);
        return "redirect:/";
    }
}
