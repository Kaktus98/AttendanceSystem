package com.finalthesis.AttendanceSystem.db.mapper;

import com.finalthesis.AttendanceSystem.domain.PredmetyUcitel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PredmetyUcitelRowMapper implements RowMapper<PredmetyUcitel> {
    @Override
    public PredmetyUcitel mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new PredmetyUcitel(rs.getString("nazov_predmetu"));
    }
}
