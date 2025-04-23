package com.project.dev.exceptions.user;

import com.project.dev.exceptions.BaseException;

public class EmailAlreadyExistsException extends BaseException {
    public EmailAlreadyExistsException(){
        super("Email already exists");
    }
}
