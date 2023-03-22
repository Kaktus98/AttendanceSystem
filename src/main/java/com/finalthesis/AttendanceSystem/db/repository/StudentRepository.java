package com.finalthesis.AttendanceSystem.db.repository;

import com.finalthesis.AttendanceSystem.db.mapper.StudentRowMapper;
import com.finalthesis.AttendanceSystem.domain.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StudentRowMapper studentRowMapper;

    public StudentRepository() {}

    public Login getEmail(String email) {
        final String sql = "select * from student where student.email=" +email;
        try {
            return jdbcTemplate.queryForObject(sql, studentRowMapper);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
