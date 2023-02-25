package com.finalthesis.AttendanceSystem.db.repository;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentRepository {

    private final JdbcTemplate jdbcTemplate;

    private final StudentRepository studentRepository = new StudentRepository();

    public StudentRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
