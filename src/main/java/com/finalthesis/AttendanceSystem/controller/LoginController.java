package com.finalthesis.AttendanceSystem.controller;

import com.finalthesis.AttendanceSystem.db.service.api.LoginService;
import com.finalthesis.AttendanceSystem.domain.Login;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping
    public ResponseEntity<Login> getUserLogin(@RequestBody String email) {
        Login login = loginService.getUserByEmail(email);
        if (login != null) {
            return ResponseEntity.ok(login);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
