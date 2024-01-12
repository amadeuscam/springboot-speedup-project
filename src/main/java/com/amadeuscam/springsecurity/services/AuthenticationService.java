package com.amadeuscam.springsecurity.services;

import com.amadeuscam.springsecurity.dto.JwtAuthenticationResponse;
import com.amadeuscam.springsecurity.dto.RefreshTokenRequest;
import com.amadeuscam.springsecurity.dto.SignInRequest;
import com.amadeuscam.springsecurity.dto.SignUpRequest;
import com.amadeuscam.springsecurity.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signin(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
