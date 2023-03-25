package com.finalthesis.AttendanceSystem.db.repository;

import com.finalthesis.AttendanceSystem.db.mapper.PredmetRowMapper;
import com.finalthesis.AttendanceSystem.db.mapper.PredmetyStudentRowMapper;
import com.finalthesis.AttendanceSystem.db.mapper.PredmetyUcitelRowMapper;
import com.finalthesis.AttendanceSystem.domain.Predmet;
import com.finalthesis.AttendanceSystem.domain.PredmetyStudent;
import com.finalthesis.AttendanceSystem.domain.PredmetyUcitel;
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

    @Autowired
    private PredmetyUcitelRowMapper predmetyUcitelRowMapper;

    @Autowired
    private PredmetyStudentRowMapper predmetyStudentRowMapper;


    public List<Predmet> getPredmety(Integer id_ucitel, String den, String nazov_predmetu) {
        if (nazov_predmetu == null) {
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

    public List<PredmetyUcitel> getPredmetyUcitel(Integer id_ucitel) {
        final String sql = "SELECT predmet.nazov_predmetu FROM predmet WHERE predmet.id_ucitel = ?";

        return jdbcTemplate.query(sql, predmetyUcitelRowMapper, id_ucitel);
    }

    public List<PredmetyStudent> getPredmetyStudent(Integer id_student) {
        final String sql = "SELECT p.nazov_predmetu " +
                "FROM predmet p " +
                "JOIN dochadzkaStudent ds ON p.id_predmet = ds.id_predmet " +
                "WHERE ds.id_student = ?";

        return jdbcTemplate.query(sql, predmetyStudentRowMapper, id_student);
    }
}
