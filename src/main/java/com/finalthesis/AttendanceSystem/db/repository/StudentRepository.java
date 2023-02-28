package com.finalthesis.AttendanceSystem.db.repository;

import com.finalthesis.AttendanceSystem.db.mapper.StudentRowMapper;
import com.finalthesis.AttendanceSystem.domain.Student;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    private final StudentRowMapper studentRowMapper = new StudentRowMapper();

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Student getEmail(String email) {
        final String sql = "select * from student where student.email ="+email;
        try {
            return jdbcTemplate.queryForObject(sql,studentRowMapper);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

}
