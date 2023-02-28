package com.finalthesis.AttendanceSystem.db.repository;

import com.finalthesis.AttendanceSystem.db.mapper.DochadzkaRowMapper;
import com.finalthesis.AttendanceSystem.domain.Dochadzka;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DochadzkaRepository {

    private final JdbcTemplate jdbcTemplate;

    private final DochadzkaRowMapper dochadzkaRowMapper = new DochadzkaRowMapper();

    public DochadzkaRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Dochadzka> getDochadzka(Integer id_student, String den, String nazov_predmetu) {
        final String sql = "SELECT dochadzka.id_dochadzka, student.meno, student.priezvisko, predmet.den, predmet.nazov_predmetu, dochadzka.status " +
                "FROM dochadzka " +
                "JOIN student ON dochadzka.id_student = student.id_student " +
                "JOIN predmet ON dochadzka.id_predmet = predmet.id_predmet " +
                "WHERE student.id_student ="+id_student+" AND predmet.den ="+den+" AND predmet.nazov_predmetu ="+nazov_predmetu;

        return jdbcTemplate.query(sql, dochadzkaRowMapper);
    }


}
