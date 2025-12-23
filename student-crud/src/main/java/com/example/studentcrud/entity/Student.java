package com.example.studentcrud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "STUDENT")
public class Student {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_seq_gen"
    )
    @SequenceGenerator(
            name = "student_seq_gen",
            sequenceName = "STUDENT_SEQ",
            allocationSize = 1
    )
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "COURSE")
    private String course;

    // ===== Constructors =====
    public Student() {
    }

    public Student(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    // ===== Getters & Setters =====
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
