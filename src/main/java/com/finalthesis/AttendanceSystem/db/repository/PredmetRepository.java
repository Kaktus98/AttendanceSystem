package com.finalthesis.AttendanceSystem.db.repository;

import com.finalthesis.AttendanceSystem.db.mapper.DochadzkaStudentRowMapper;
import com.finalthesis.AttendanceSystem.db.mapper.PredmetRowMapper;
import com.finalthesis.AttendanceSystem.domain.Predmet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PredmetRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private PredmetRowMapper predmetRowMapper;


    public List<Predmet> getPredmety(Integer id_ucitel, String den, String nazov_predmetu) {
        if( nazov_predmetu == null) {
            final String sql = "SELECT * " +
                    "FROM predmet " +
                    "WHERE predmet.id_ucitel = ? AND predmet.den=? ";

            return jdbcTemplate.query(sql, predmetRowMapper, id_ucitel, den);
        } else {
            final String sql = "SELECT * " +
                    "FROM predmet " +
                    "WHERE predmet.id_ucitel = ? AND predmet.den=? AND predmet.nazov_predmetu = ? ";

            return jdbcTemplate.query(sql, predmetRowMapper, id_ucitel, den, nazov_predmetu);
        }
    }
}
