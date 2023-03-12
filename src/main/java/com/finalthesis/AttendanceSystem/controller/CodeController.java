package com.finalthesis.AttendanceSystem.controller;

import com.finalthesis.AttendanceSystem.db.service.api.CodeService;
import com.finalthesis.AttendanceSystem.domain.Validation;
import com.mysql.cj.x.protobuf.Mysqlx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CodeController {

    @Autowired
    private CodeService codeService;

    @GetMapping("/generate")
    public ResponseEntity<String> generate(@RequestParam Integer id_predmet) {
        var uuidCode = codeService.generate(id_predmet);
        return new ResponseEntity<>(uuidCode, HttpStatus.OK);
    }

    @PostMapping("/validate")
    public ResponseEntity<Validation> validate(@RequestBody Validation validation) { //ak badRequest tak object type
        try {
            codeService.validate(validation.getUuidCode(), validation.getId_student());
            return new ResponseEntity<>( HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return (ResponseEntity<Validation>) ResponseEntity.badRequest();
        }


    }

}
