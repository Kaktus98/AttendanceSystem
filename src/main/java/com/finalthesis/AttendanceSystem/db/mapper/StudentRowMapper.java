package com.finalthesis.AttendanceSystem.db.mapper;

import com.finalthesis.AttendanceSystem.domain.Login;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Login> {
    @Override
    public Login mapRow(ResultSet rs, int rowNum) throws SQLException {
//        Student student = new Student();
//        student.setId_student(rs.getInt("id_student"));
//        student.setMeno(rs.getString("meno"));
//        student.setPriezvisko(rs.getString("priezvisko"));
//        student.setEmail(rs.getString("email"));
//        student.setId_predmet(rs.getInt("id_predmet"));
//        student.setId_odbor(rs.getInt("id_odbor"));
//        student.setId_rocnik(rs.getInt("id_rocnik"));
//        return student;
        return new Login(rs.getInt("id_student"),"STUDENT");
  }

}
