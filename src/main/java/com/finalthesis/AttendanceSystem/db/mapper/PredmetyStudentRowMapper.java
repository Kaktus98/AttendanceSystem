package com.finalthesis.AttendanceSystem.db.mapper;

import com.finalthesis.AttendanceSystem.domain.PredmetyStudent;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PredmetyStudentRowMapper implements RowMapper<PredmetyStudent> {

    @Override
    public PredmetyStudent mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new PredmetyStudent(rs.getString("nazov_predmetu"));
    }
}

