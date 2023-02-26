package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Student;

import java.util.List;

public interface StudentService {

    List<Student> getStudentov();

    Student getStudentByEmail(String email); //prvy krok potrebny na prihlasenie
    //Post reaquest v controlleri a bude to Login end point
    //vrati sa mi riadok studenta po uspesnom prihlaseni vratime celeho studenta s id a vsetkym a dalej uz viem s tymto pracovat
    //uloziť ID


}
