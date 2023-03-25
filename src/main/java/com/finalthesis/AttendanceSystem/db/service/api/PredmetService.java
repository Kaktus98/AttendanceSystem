package com.finalthesis.AttendanceSystem.db.service.api;

import com.finalthesis.AttendanceSystem.domain.Predmet;
import com.finalthesis.AttendanceSystem.domain.PredmetyStudent;
import com.finalthesis.AttendanceSystem.domain.PredmetyUcitel;

import java.util.List;

public interface PredmetService {

    List<Predmet> getPredmety(int id_ucitel, String den, String nazov_predmetu);

    List<PredmetyUcitel> getPredmetyUcitel(Integer id_ucitel);

    List<PredmetyStudent> getPredmetyStudent(Integer id_student);

}
