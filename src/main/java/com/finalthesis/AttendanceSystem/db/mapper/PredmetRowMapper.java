package com.finalthesis.AttendanceSystem.db.mapper;

import com.finalthesis.AttendanceSystem.domain.Predmet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PredmetRowMapper implements RowMapper<Predmet> {

    @Override
    public Predmet mapRow(ResultSet rs, int rowNum) throws SQLException {
        Predmet predmet = new Predmet();
        predmet.setId(rs.getInt("id_predmet"));
        predmet.setNazov_predmetu(rs.getString("nazov_predmetu"));
        predmet.setSkupina(rs.getString("skupina"));
        predmet.setUcebna(rs.getString("ucebna"));
        predmet.setDatum(rs.getString("datum"));
        predmet.setCas(rs.getString("cas"));
        return predmet;
    }
}