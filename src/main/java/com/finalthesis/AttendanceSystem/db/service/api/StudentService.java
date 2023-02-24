package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentov();

    Student get(int id);
}
