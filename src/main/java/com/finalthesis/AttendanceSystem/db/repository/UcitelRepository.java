package com.finalthesis.AttendanceSystem.db.repository;


import com.finalthesis.AttendanceSystem.db.mapper.UcitelRowMapper;
import com.finalthesis.AttendanceSystem.domain.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UcitelRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UcitelRowMapper ucitelRowMapper;

    public UcitelRepository() {}

    public Login getEmail(String email) {
        final String sql = "select * from ucitel where ucitel.email ="+email;
        try {
            return jdbcTemplate.queryForObject(sql, ucitelRowMapper);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
}
