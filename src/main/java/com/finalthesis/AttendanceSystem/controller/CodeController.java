package com.finalthesis.AttendanceSystem.controller;

import com.finalthesis.AttendanceSystem.db.service.api.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController {

    @Autowired
    private ConcurrentMapCache myCache;

    @Autowired
    private CodeService codeService;

    @GetMapping("/generate")
    public ResponseEntity<String> generate(@RequestBody Integer id_predmet) {
        var uuidCode = codeService.generate(id_predmet);
        return new ResponseEntity<>(uuidCode, HttpStatus.OK);
    }

    @PostMapping("/validate")
    public Object validate(@RequestBody String uuidCode, @RequestBody Integer id_student) { //ak badRequest tak object type
        try {
            codeService.validate(uuidCode, id_student);
            return new ResponseEntity<>("", HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest();
        }



    }

}
