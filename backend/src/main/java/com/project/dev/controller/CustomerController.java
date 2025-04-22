package com.project.dev.controller;

import com.project.dev.service.ICustomerService;
import com.project.dev.entity.request.UserRegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    private final ICustomerService customerService;

    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/signup")
    public BaseResponse<SessionUserVO>customerSignUp(   //SessionUserVO is to not expose data schema to outside
            @RequestBody UserRegisterRequest request){

    }


}
