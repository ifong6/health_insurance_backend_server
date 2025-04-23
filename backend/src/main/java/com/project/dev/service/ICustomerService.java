package com.project.dev.service;

import com.project.dev.entity.po.CustomerPO;
import com.project.dev.entity.request.UserLoginRequest;
import com.project.dev.entity.request.UserRegisterRequest;
import com.project.dev.entity.vo.SessionCustomerVO;

import java.util.List;

public interface ICustomerService {
    SessionCustomerVO signUp(UserRegisterRequest request);

    boolean logIn(UserLoginRequest request);

    CustomerPO findById(Integer id);

    CustomerPO findByEmail(CustomerPO customer);

    List<CustomerPO> findAll();

    void deleteById(Integer id);


}
