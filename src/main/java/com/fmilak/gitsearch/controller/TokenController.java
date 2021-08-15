package com.fmilak.gitsearch.controller;

import com.fmilak.gitsearch.model.Token;
import com.fmilak.gitsearch.model.User;
import com.fmilak.gitsearch.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api")
public class TokenController {

    @Autowired
    private LoginService loginService;

    @CrossOrigin
    @PostMapping("/token")
    public ResponseEntity<Token> login(@RequestBody User user) {
        return new ResponseEntity<>(loginService.login(user), HttpStatus.OK);
    }

}
