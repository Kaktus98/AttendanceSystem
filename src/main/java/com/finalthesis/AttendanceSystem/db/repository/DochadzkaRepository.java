package com.finalthesis.AttendanceSystem.db.repository;

import com.finalthesis.AttendanceSystem.db.mapper.DochadzkaStudentRowMapper;
import com.finalthesis.AttendanceSystem.db.mapper.DochadzkaUcitelRowMapper;
import com.finalthesis.AttendanceSystem.domain.DochadzkaStudent;
import com.finalthesis.AttendanceSystem.domain.DochadzkaUcitel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Component
public class DochadzkaRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private DochadzkaStudentRowMapper dochadzkaStudentRowMapper;

    @Autowired
    private DochadzkaUcitelRowMapper dochadzkaUcitelRowMapper;

    public DochadzkaRepository() {
    }

    public List<DochadzkaStudent> getDochadzka(Integer id_student, String den, String nazov_predmetu) {
        final String sql = "SELECT dochadzka.id_dochadzka, student.meno, student.priezvisko, predmet.den, predmet.nazov_predmetu, dochadzka.status, dochadzka.datum " +
                "FROM dochadzka " +
                "JOIN student ON dochadzka.id_student = student.id_student " +
                "JOIN predmet ON dochadzka.id_predmet = predmet.id_predmet " +
                "WHERE student.id_student =? AND predmet.den=? AND predmet.nazov_predmetu =?";

        return jdbcTemplate.query(sql, dochadzkaStudentRowMapper, id_student, den, nazov_predmetu);
    }

    public void createNewDochadzka(Object id_predmet, Integer id_student) {
        final String sql = "INSERT INTO dochadzka (id_predmet, id_student) VALUES (?, ?)";

        jdbcTemplate.update(sql, id_predmet, id_student);

    }

    public List<DochadzkaUcitel> getDochadzkaUcitel(Integer id_predmet, String datum) {
        final String sql = "SELECT dochadzka.id_dochadzka,student.meno, student.priezvisko, dochadzka.status " +
                "FROM dochadzka " +
                "JOIN student ON dochadzka.id_student = student.id_student " +
                "WHERE dochadzka.id_predmet = ? AND DATE(dochadzka.datum) = ?";


        return jdbcTemplate.query(sql,dochadzkaUcitelRowMapper,id_predmet,datum);

    }



}
