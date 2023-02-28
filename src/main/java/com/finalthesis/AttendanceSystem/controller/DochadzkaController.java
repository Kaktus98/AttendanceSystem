package com.finalthesis.AttendanceSystem.controller;

import com.finalthesis.AttendanceSystem.db.service.api.DochadzkaService;
import com.finalthesis.AttendanceSystem.domain.Dochadzka;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("prehlad")
public class DochadzkaController {

    private final DochadzkaService dochadzkaService;

    public DochadzkaController(DochadzkaService dochadzkaService) {
        this.dochadzkaService = dochadzkaService;
    }

    @GetMapping("/{id_student}")
    public ResponseEntity getAttendance(@PathVariable("id_student") Integer id_student, @RequestParam String den, @RequestParam String nazov_predmetu) {
        List<Dochadzka> dochadzkaList = dochadzkaService.getDochadzka(id_student,den,nazov_predmetu);
        return new ResponseEntity<>(dochadzkaList, HttpStatus.OK);
    }


}
