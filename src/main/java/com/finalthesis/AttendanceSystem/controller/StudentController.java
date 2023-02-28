package com.finalthesis.AttendanceSystem.controller;

import com.finalthesis.AttendanceSystem.db.service.api.StudentService;
import com.finalthesis.AttendanceSystem.domain.Student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController{

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/login")
    public ResponseEntity<Student> getEmail(@RequestBody String email) {
        Student student = studentService.getStudentByEmail(email);
        if (student != null) {
            return ResponseEntity.ok(student);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
