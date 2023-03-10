package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Predmet;

import java.util.Date;
import java.util.List;

public interface PredmetService {

    List<Predmet> getPredmety(int id_ucitel, String  den,String nazov_predmetu);

    Predmet get(int id);
}
