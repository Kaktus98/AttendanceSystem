package com.finalthesis.AttendanceSystem.db.mapper;

import com.finalthesis.AttendanceSystem.domain.Dochadzka;
import com.finalthesis.AttendanceSystem.domain.Predmet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DochadzkaRowMapper implements RowMapper<Dochadzka> {
    @Override
    public Dochadzka mapRow(ResultSet rs, int rowNum) throws SQLException {
        Dochadzka dochadzka = new Dochadzka();
        dochadzka.setId_dochadzka(rs.getInt("id_dochadzka"));
        dochadzka.setStatus(rs.getBoolean("status"));
        dochadzka.setId_predmet(rs.getInt("id_predmet"));
        dochadzka.setId_student(rs.getInt("id_student"));
        return dochadzka;
    }
}
