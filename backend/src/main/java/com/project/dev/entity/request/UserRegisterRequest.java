package com.project.dev.entity.request;

import lombok.Data;

@Data
public class UserRegisterRequest {

    private String email;
    private String password;
    private String verificationCode; // SMS/Email verification code
    private String verificationToken;
}
