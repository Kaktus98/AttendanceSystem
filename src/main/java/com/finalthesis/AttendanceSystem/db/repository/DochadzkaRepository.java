package com.finalthesis.AttendanceSystem.db.repository;

import com.finalthesis.AttendanceSystem.db.mapper.DochadzkaSkupinaRowMapper;
import com.finalthesis.AttendanceSystem.db.mapper.DochadzkaStudentRowMapper;
import com.finalthesis.AttendanceSystem.db.mapper.DochadzkaUcitelRowMapper;
import com.finalthesis.AttendanceSystem.domain.DochadzkaSkupina;
import com.finalthesis.AttendanceSystem.domain.DochadzkaStudent;
import com.finalthesis.AttendanceSystem.domain.DochadzkaUcitel;
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

    @Autowired
    private DochadzkaUcitelRowMapper dochadzkaUcitelRowMapper;

    @Autowired
    private DochadzkaSkupinaRowMapper dochadzkaSkupinaRowMapper;

    public DochadzkaRepository() {
    }

    public List<DochadzkaStudent> getDochadzka(Integer id_student, String den, String nazov_predmetu) {
        if (nazov_predmetu == null) {
            final String sql = "SELECT dochadzka.id_dochadzka, student.meno, student.priezvisko, predmet.den, predmet.nazov_predmetu, dochadzka.status, dochadzka.datum " +
                    "FROM dochadzka " +
                    "JOIN student ON dochadzka.id_student = student.id_student " +
                    "JOIN predmet ON dochadzka.id_predmet = predmet.id_predmet " +
                    "WHERE student.id_student =? AND predmet.den=?";

            return jdbcTemplate.query(sql, dochadzkaStudentRowMapper, id_student, den);
        } else {
            final String sql = "SELECT dochadzka.id_dochadzka, student.meno, student.priezvisko, predmet.den, predmet.nazov_predmetu, dochadzka.status, dochadzka.datum " +
                    "FROM dochadzka " +
                    "JOIN student ON dochadzka.id_student = student.id_student " +
                    "JOIN predmet ON dochadzka.id_predmet = predmet.id_predmet " +
                    "WHERE student.id_student =? AND predmet.den=? AND predmet.nazov_predmetu =?";

            return jdbcTemplate.query(sql, dochadzkaStudentRowMapper, id_student, den, nazov_predmetu);
        }


    }

    public void createNewDochadzka(Object id_predmet, Integer id_student) {
        final String sql = "INSERT INTO dochadzka (id_predmet, id_student) " +
                "SELECT ?, ? " +
                "WHERE NOT EXISTS ( " +
                "SELECT id_dochadzka " +
                "FROM dochadzka " +
                "WHERE id_predmet = ? AND id_student = ? AND DATE_FORMAT(datum, '%Y-%m-%d') = DATE_FORMAT(NOW(), '%Y-%m-%d'))";

        jdbcTemplate.update(sql, id_predmet, id_student,id_predmet,id_student);

    }

    public List<DochadzkaUcitel> getDochadzkaUcitel(Integer id_predmet, String datum) {
        final String sql = "SELECT dochadzka.id_dochadzka,dochadzka.id_student,student.meno, student.priezvisko, dochadzka.status " +
                "FROM dochadzka " +
                "JOIN student ON dochadzka.id_student = student.id_student " +
                "WHERE dochadzka.id_predmet = ? AND DATE(dochadzka.datum) = ?";


        return jdbcTemplate.query(sql, dochadzkaUcitelRowMapper, id_predmet, datum);

    }

    public List<DochadzkaSkupina> getSkupina(Integer id_predmet) {
        final String sql = "SELECT d.id_predmet, d.id_student, s.meno, s.priezvisko " +
                "FROM dochadzkaStudent d " +
                "JOIN student s ON s.id_student = d.id_student " +
                "WHERE d.id_predmet = ? ";

        return jdbcTemplate.query(sql,dochadzkaSkupinaRowMapper, id_predmet);
    }

}
