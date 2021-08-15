package com.fmilak.gitsearch.repository;

import com.fmilak.gitsearch.model.Token;
import com.fmilak.gitsearch.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface LoginRepository {

    User getUserData(String username);

    Token getToken();

}
