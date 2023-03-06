package com.finalthesis.AttendanceSystem.db.mapper;

import com.finalthesis.AttendanceSystem.domain.DochadzkaStudent;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DochadzkaStudentRowMapper implements RowMapper<DochadzkaStudent> {
    @Override
    public DochadzkaStudent mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new DochadzkaStudent(
                rs.getInt("id_dochadzka"),
                rs.getString("meno"),
                rs.getString("priezvisko"),
                rs.getString("den"),
                rs.getString("nazov_predmetu"),
                rs.getBoolean("status"),
                rs.getDate("datum")
        );
    }
}
