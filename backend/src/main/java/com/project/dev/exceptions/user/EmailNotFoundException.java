package com.project.dev.exceptions.user;

import com.project.dev.exceptions.BaseException;

public class EmailNotFoundException extends BaseException {
    public EmailNotFoundException(){
        super("Email not existed.");
    }
}
