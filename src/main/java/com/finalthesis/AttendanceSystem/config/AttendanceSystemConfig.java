package com.finalthesis.AttendanceSystem.config;


import com.finalthesis.AttendanceSystem.db.mapper.*;
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


    @Bean
    public PredmetRowMapper predmetRowMapper() {return new PredmetRowMapper();}

    @Bean
    public DochadzkaUcitelRowMapper dochadzkaUcitelRowMapper() {return new DochadzkaUcitelRowMapper();}

    @Bean
    public DochadzkaSkupinaRowMapper dochadzkaSkupinaRowMapper() {return new DochadzkaSkupinaRowMapper();}
    @Bean
    public PredmetyUcitelRowMapper predmetyUcitelRowMapper() {return  new PredmetyUcitelRowMapper();}

    @Bean
    public PredmetyStudentRowMapper predmetyStudentRowMapper() {return  new PredmetyStudentRowMapper();}

}
