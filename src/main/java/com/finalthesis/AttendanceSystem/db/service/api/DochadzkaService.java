package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Dochadzka;

import java.util.List;

public interface DochadzkaService {

    List<Dochadzka> getDochadzka();

    Dochadzka get(int id);
    Integer add(Dochadzka dochadzka); //spytaj sa peťa
}
