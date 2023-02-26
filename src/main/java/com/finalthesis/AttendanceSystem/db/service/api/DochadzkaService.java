package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Dochadzka;
import io.micrometer.common.lang.Nullable;

import java.util.List;

public interface DochadzkaService {

    List<Dochadzka> getDochadzka(int id_student, String datum,String nazov_predmetu); //poradil peťo, budeme selectovat v repository, id je mapovane na studenta
    Dochadzka get(int id);
    Integer add(Dochadzka dochadzka); //spytaj sa peťa
}
