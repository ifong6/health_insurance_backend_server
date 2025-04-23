package com.project.dev.exceptions.user;

import com.project.dev.exceptions.BaseException;

public class UserNotFoundException extends BaseException {
    public UserNotFoundException(String message){
        super(message);
    }
}
