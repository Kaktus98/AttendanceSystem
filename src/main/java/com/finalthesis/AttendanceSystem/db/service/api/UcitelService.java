package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Ucitel;

import java.util.List;

public interface UcitelService {

    List<Ucitel> getUcitelov();

    Ucitel get(int id);


}
