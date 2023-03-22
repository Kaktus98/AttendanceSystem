package com.finalthesis.AttendanceSystem.db.mapper;

import com.finalthesis.AttendanceSystem.domain.DochadzkaSkupina;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DochadzkaSkupinaRowMapper implements RowMapper<DochadzkaSkupina> {
    @Override
    public DochadzkaSkupina mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new DochadzkaSkupina(
                rs.getInt("id_predmet"),
                rs.getInt("id_student"),
                rs.getString("meno"),
                rs.getString("priezvisko")
        );
    }
}
