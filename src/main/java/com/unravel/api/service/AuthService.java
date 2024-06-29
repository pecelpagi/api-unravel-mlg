package com.unravel.api.service;

import com.unravel.api.entity.BusinessUser;
import com.unravel.api.model.auth.BusinessUserResponse;
import com.unravel.api.model.auth.LoginRequest;
import com.unravel.api.repository.BusinessUserRepository;
import com.unravel.api.security.BCrypt;
import com.unravel.api.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

public interface AuthService {

    String businessUserLogin(LoginRequest loginRequest);
    BusinessUserResponse getProfile(String email);

}
