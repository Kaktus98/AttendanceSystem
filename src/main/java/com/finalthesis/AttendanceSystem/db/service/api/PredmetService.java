package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Predmet;

import java.util.List;

public interface PredmetService {

    List<Predmet> getPredmety();

    Predmet get(int id);
}
