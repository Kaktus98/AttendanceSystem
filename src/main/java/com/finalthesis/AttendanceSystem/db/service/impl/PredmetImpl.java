package com.finalthesis.AttendanceSystem.db.service.impl;


import com.finalthesis.AttendanceSystem.db.repository.PredmetRepository;
import com.finalthesis.AttendanceSystem.db.service.api.PredmetService;
import com.finalthesis.AttendanceSystem.domain.Predmet;
import com.finalthesis.AttendanceSystem.domain.PredmetyStudent;
import com.finalthesis.AttendanceSystem.domain.PredmetyUcitel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredmetImpl implements PredmetService {

    private final PredmetRepository predmetRepository;

    public PredmetImpl(PredmetRepository predmetRepository) {
        this.predmetRepository = predmetRepository;
    }

    @Override
    public List<Predmet> getPredmety(int id_ucitel, String den, String nazov_predmetu) {
        return predmetRepository.getPredmety(id_ucitel, den, nazov_predmetu);
    }

    @Override
    public List<PredmetyUcitel> getPredmetyUcitel(Integer id_ucitel) {
        return predmetRepository.getPredmetyUcitel(id_ucitel);
    }
    @Override
    public List<PredmetyStudent> getPredmetyStudent(Integer id_student) {
        return predmetRepository.getPredmetyStudent(id_student);
    }

}
