package com.finalthesis.AttendanceSystem.db.service.impl;


import com.finalthesis.AttendanceSystem.db.repository.DochadzkaRepository;
import com.finalthesis.AttendanceSystem.db.service.api.DochadzkaService;
import com.finalthesis.AttendanceSystem.domain.Dochadzka;
import com.finalthesis.AttendanceSystem.domain.DochadzkaStudent;
import com.finalthesis.AttendanceSystem.domain.DochadzkaUcitel;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Service
public class DochadzkaImpl implements DochadzkaService {

    private final DochadzkaRepository dochadzkaRepository;

    public DochadzkaImpl(DochadzkaRepository dochadzkaRepository) {
        this.dochadzkaRepository = dochadzkaRepository;
    }

    @Override
    public List<DochadzkaStudent> getDochadzka(Integer id_student, String den, String nazov_predmetu) {
        return dochadzkaRepository.getDochadzka(id_student,den,nazov_predmetu);
    }

    @Override
    public List<DochadzkaUcitel> getDochadzkaUcitel(Integer id_predmet, String datum) {
        return dochadzkaRepository.getDochadzkaUcitel(id_predmet,datum);
    }


    @Override
    public Dochadzka get(Integer id) {
        return null;
    }

    @Override
    public Integer add(Dochadzka dochadzka) {
        return null;
    }
}
