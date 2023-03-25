package com.finalthesis.AttendanceSystem.controller;

import com.finalthesis.AttendanceSystem.db.service.api.PredmetService;
import com.finalthesis.AttendanceSystem.domain.Predmet;
import com.finalthesis.AttendanceSystem.domain.PredmetyStudent;
import com.finalthesis.AttendanceSystem.domain.PredmetyUcitel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prehladPredmetov")
public class PredmetController {

    @Autowired
    private PredmetService predmetService;



    @GetMapping("/{id_ucitel}")
    public ResponseEntity<List<Predmet>> getAttendance(@PathVariable("id_ucitel") Integer id_ucitel, @RequestParam String den, @RequestParam(required = false) String nazov_predmetu) {
        List<Predmet> predmetList = predmetService.getPredmety(id_ucitel, den, nazov_predmetu);
        return new ResponseEntity<>(predmetList, HttpStatus.OK);
    }

    @GetMapping("/predmetyUcitel/{id_ucitel}")
    public ResponseEntity<List<PredmetyUcitel>> getPredmetUcitel(@PathVariable("id_ucitel") Integer id_ucitel) {
        List<PredmetyUcitel> predmetyUcitelList = predmetService.getPredmetyUcitel(id_ucitel);
        return new ResponseEntity<>(predmetyUcitelList, HttpStatus.OK);
    }

    @GetMapping("/predmetyStudent/{id_student}")
    public ResponseEntity<List<PredmetyStudent>> getPredmetyStudent(@PathVariable("id_student") Integer id_student) {
        List<PredmetyStudent> predmetyStudentList = predmetService.getPredmetyStudent(id_student);
        return new ResponseEntity<>(predmetyStudentList, HttpStatus.OK);
    }


}
