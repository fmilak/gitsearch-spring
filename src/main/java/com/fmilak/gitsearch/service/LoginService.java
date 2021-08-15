package com.fmilak.gitsearch.service;

import com.fmilak.gitsearch.model.ApiResponse;
import com.fmilak.gitsearch.model.Token;
import com.fmilak.gitsearch.model.User;
import com.fmilak.gitsearch.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public Token login(User user) {

        User dbUser = loginRepository.getUserData(user.getUsername());

        if (Objects.equals(dbUser.getPassword(), user.getPassword())) {
            return loginRepository.getToken();
        }

        return new Token();
    }

}
