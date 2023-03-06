package com.finalthesis.AttendanceSystem.db.repository;

import com.finalthesis.AttendanceSystem.db.mapper.DochadzkaRowMapper;
import com.finalthesis.AttendanceSystem.db.mapper.DochadzkaStudentRowMapper;
import com.finalthesis.AttendanceSystem.domain.Dochadzka;
import com.finalthesis.AttendanceSystem.domain.DochadzkaStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DochadzkaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private DochadzkaStudentRowMapper dochadzkaStudentRowMapper;

    public DochadzkaRepository() {}

    public List<DochadzkaStudent> getDochadzka(Integer id_student, String den, String nazov_predmetu) {
        final String sql = "SELECT dochadzka.id_dochadzka, student.meno, student.priezvisko, predmet.den, predmet.nazov_predmetu, dochadzka.status, dochadzka.datum " +
                "FROM dochadzka " +
                "JOIN student ON dochadzka.id_student = student.id_student " +
                "JOIN predmet ON dochadzka.id_predmet = predmet.id_predmet " +
                "WHERE student.id_student =? AND predmet.den=? AND predmet.nazov_predmetu =?";

        return jdbcTemplate.query(sql, dochadzkaStudentRowMapper, id_student, den, nazov_predmetu);
    }


}
