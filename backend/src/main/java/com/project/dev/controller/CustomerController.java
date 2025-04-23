package com.project.dev.controller;

import com.project.dev.entity.request.UserLoginRequest;
import com.project.dev.entity.vo.SessionCustomerVO;
import com.project.dev.exceptions.user.EmailAlreadyExistsException;
import com.project.dev.entity.request.UserRegisterRequest;
import com.project.dev.service.impl.CustomerServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("customer")
public class CustomerController {
    private final CustomerServiceImpl customerService;

    public CustomerController(CustomerServiceImpl customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/signUp")
    public ResponseEntity<SessionCustomerVO> customerSignUp(   //SessionUserVO is to not expose data schema to outside
       @Validated @RequestBody UserRegisterRequest request){
        try {
            // 2. Process registration
            SessionCustomerVO registeredUser = customerService.signUp(request);

            // 3. Return success response
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(registeredUser);

        } catch (EmailAlreadyExistsException e) {
            // 4. handle user that already signed-up
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    e.getMessage()
            );
        } catch(IllegalArgumentException e){
            // 5. handle all other errors
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    e.getMessage()
            );
        }
    }

    @PostMapping("/logIn")
    public HttpStatus customerSignIn(   //SessionUserVO is to not expose data schema to outside
           @Validated @RequestBody UserLoginRequest request){
        try {
            // 1. validate registration
            boolean userExisted = customerService.logIn(request);

            if (!userExisted) {
                throw new ResponseStatusException(
                        HttpStatus.BAD_REQUEST,
                        "User not registered"
                );
            }
            // 3. Return success response
            return HttpStatus.ACCEPTED;

        } catch(Exception e){
            // 5. handle all other errors
            throw new ResponseStatusException(
                    HttpStatus.INTERNAL_SERVER_ERROR,
                    e.getMessage()
            );
        }
    }
}
