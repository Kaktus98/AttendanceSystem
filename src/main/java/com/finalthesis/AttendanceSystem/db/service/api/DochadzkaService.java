package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Dochadzka;
import com.finalthesis.AttendanceSystem.domain.DochadzkaStudent;

import java.util.List;

public interface DochadzkaService {

    List<DochadzkaStudent> getDochadzka(Integer id_student, String den, String nazov_predmetu); //poradil peťo, budeme selectovat v repository, id je mapovane na studenta

    Dochadzka get(Integer id);

    Integer add(Dochadzka dochadzka);
}
