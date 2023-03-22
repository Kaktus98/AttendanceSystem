package com.finalthesis.AttendanceSystem.controller;

import com.finalthesis.AttendanceSystem.db.service.api.DochadzkaService;
import com.finalthesis.AttendanceSystem.domain.DochadzkaSkupina;
import com.finalthesis.AttendanceSystem.domain.DochadzkaStudent;
import com.finalthesis.AttendanceSystem.domain.DochadzkaUcitel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prehlad")
public class DochadzkaController {

    @Autowired
    private DochadzkaService dochadzkaService;

    @GetMapping("/student/{id_student}")
    public ResponseEntity<List<DochadzkaStudent>> getAttendance(@PathVariable("id_student") Integer id_student, @RequestParam String den, @RequestParam(required = false) String nazov_predmetu) {
        List<DochadzkaStudent> dochadzkaList = dochadzkaService.getDochadzka(id_student, den, nazov_predmetu);
        return new ResponseEntity<>(dochadzkaList, HttpStatus.OK);
    }

    @GetMapping("/ucitel/{id_predmet}")
    public ResponseEntity<List<DochadzkaUcitel>> getDochadzkaPreUcitela(@PathVariable("id_predmet") Integer id_predmet, @RequestParam String datum) {
        List<DochadzkaUcitel> dochadzkaUcitelList = dochadzkaService.getDochadzkaUcitel(id_predmet, datum);
        return new ResponseEntity<>(dochadzkaUcitelList, HttpStatus.OK);
    }

    @GetMapping("/ucitelZoznam/{id_predmet}")
    public ResponseEntity<List<DochadzkaSkupina>> getSkupina(@PathVariable("id_predmet") Integer id_predmet) {
        List<DochadzkaSkupina> dochadzkaSkupinaList = dochadzkaService.getSkupina(id_predmet);
        return new ResponseEntity<>(dochadzkaSkupinaList, HttpStatus.OK);
    }



}
