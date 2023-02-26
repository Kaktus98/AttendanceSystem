package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Predmet;

import java.util.Date;
import java.util.List;

public interface PredmetService {

    List<Predmet> getPredmety(int id_uctitel, Date datum); //id ucitela

    Predmet get(int id);
}
