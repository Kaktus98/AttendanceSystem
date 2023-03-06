package com.finalthesis.AttendanceSystem.config;


import com.finalthesis.AttendanceSystem.db.mapper.DochadzkaStudentRowMapper;
import com.finalthesis.AttendanceSystem.db.mapper.StudentRowMapper;
import com.finalthesis.AttendanceSystem.db.mapper.UcitelRowMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AttendanceSystemConfig {

    @Bean
    public DochadzkaStudentRowMapper dochadzkaStudentRowMapper() {
        return new DochadzkaStudentRowMapper();
    }


    @Bean
    public StudentRowMapper studentRowMapper() {
        return new StudentRowMapper();
    }


    @Bean
    public UcitelRowMapper ucitelRowMapper() { return new UcitelRowMapper();}
}
