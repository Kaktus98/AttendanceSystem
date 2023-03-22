package com.finalthesis.AttendanceSystem.controller;

import com.finalthesis.AttendanceSystem.db.service.api.LoginService;
import com.finalthesis.AttendanceSystem.domain.Login;
import jakarta.servlet.http.HttpSession;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<Login> getUserLogin(@RequestBody String email) {
        Login login = loginService.getUserByEmail(email);
        if (login != null) {
            return ResponseEntity.ok(login);
        } else {
            return ResponseEntity.notFound().build();
        }
    }



}
