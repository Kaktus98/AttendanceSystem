package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Dochadzka;
import com.finalthesis.AttendanceSystem.domain.DochadzkaStudent;
import com.finalthesis.AttendanceSystem.domain.DochadzkaUcitel;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public interface DochadzkaService {

    List<DochadzkaStudent> getDochadzka(Integer id_student, String den, String nazov_predmetu); //poradil peťo, budeme selectovat v repository, id je mapovane na studenta


    List<DochadzkaUcitel> getDochadzkaUcitel(Integer id_predmet, String datum);

    Dochadzka get(Integer id);

    Integer add(Dochadzka dochadzka);
}
