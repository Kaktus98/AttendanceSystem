package com.finalthesis.AttendanceSystem.db.mapper;

import com.finalthesis.AttendanceSystem.domain.Ucitel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UcitelRowMapper implements RowMapper<Ucitel> {
    @Override
    public Ucitel mapRow(ResultSet rs, int rowNum) throws SQLException {
        Ucitel ucitel = new Ucitel();
        ucitel.setId(rs.getInt("id_ucitel"));
        ucitel.setTitul(rs.getString("titul"));
        ucitel.setMeno(rs.getString("meno"));
        ucitel.setPriezvisko(rs.getString("priezvisko"));
        ucitel.setEmail(rs.getString("email"));
        ucitel.setId_predmet(rs.getInt("id_predmet"));
        ucitel.setId_katedra(rs.getInt("id_katedra"));

        return ucitel;
    }
}