package com.finalthesis.AttendanceSystem.db.service.impl;

import com.finalthesis.AttendanceSystem.db.repository.StudentRepository;
import com.finalthesis.AttendanceSystem.db.repository.UcitelRepository;
import com.finalthesis.AttendanceSystem.db.service.api.LoginService;
import com.finalthesis.AttendanceSystem.domain.Login;
import com.finalthesis.AttendanceSystem.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginImpl implements LoginService {

    private final StudentRepository studentRepository;
    private final UcitelRepository ucitelRepository;

    public LoginImpl(StudentRepository studentRepository, UcitelRepository ucitelRepository) {
        this.studentRepository = studentRepository;
        this.ucitelRepository = ucitelRepository;
    }

    @Override
    public List<Student> getStudentov() {
        return null;
    }

    @Override
    public Login getStudentByEmail(String email) {
       Login login = studentRepository.getEmail(email);
       if(login == null) {
           login =  ucitelRepository.getEmail(email);
       }
           return login;
    }
}
