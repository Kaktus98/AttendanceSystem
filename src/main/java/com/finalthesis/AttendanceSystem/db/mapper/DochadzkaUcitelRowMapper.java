package com.finalthesis.AttendanceSystem.db.mapper;

import com.finalthesis.AttendanceSystem.domain.DochadzkaUcitel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DochadzkaUcitelRowMapper implements RowMapper<DochadzkaUcitel> {


    @Override
    public DochadzkaUcitel mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new DochadzkaUcitel(
                rs.getInt("id_dochadzka"),
                rs.getInt("id_student"),
                rs.getString("meno"),
                rs.getString("priezvisko"),
                rs.getBoolean("status")
        );
    }
}
