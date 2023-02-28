package com.finalthesis.AttendanceSystem.db.service.impl;

import com.finalthesis.AttendanceSystem.db.repository.StudentRepository;
import com.finalthesis.AttendanceSystem.db.service.api.StudentService;
import com.finalthesis.AttendanceSystem.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudentov() {
        return null;
    }

    @Override
    public Student getStudentByEmail(String email) {
        return studentRepository.getEmail(email);
    }
}
