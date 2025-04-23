package com.project.dev.exceptions.user;

import com.project.dev.exceptions.BaseException;

public class PasswordNotValidException extends BaseException {
    public PasswordNotValidException(String message){
        super(message);
    }
}
