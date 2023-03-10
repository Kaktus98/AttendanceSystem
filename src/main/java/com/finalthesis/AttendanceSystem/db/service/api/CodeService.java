package com.finalthesis.AttendanceSystem.db.service.api;

public interface CodeService {

    String generate(Integer id_predmet);

    void validate(String uuidCode, Integer id_student);
}
