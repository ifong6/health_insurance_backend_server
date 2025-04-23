package com.project.dev.service.impl;

import com.project.dev.entity.po.CustomerPO;
import com.project.dev.entity.request.UserLoginRequest;
import com.project.dev.entity.request.UserRegisterRequest;
import com.project.dev.entity.vo.SessionCustomerVO;
import com.project.dev.exceptions.user.EmailAlreadyExistsException;
import com.project.dev.exceptions.user.PasswordNotValidException;
import com.project.dev.exceptions.user.UserNotFoundException;
import com.project.dev.repository.CustomerRepository;
import com.project.dev.service.ICustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public SessionCustomerVO signUp(UserRegisterRequest request){
        // check params

        // request -> CustomerPO
        CustomerPO existingCustomer = customerRepository.findByEmail(request.getEmail());

        if (Objects.nonNull(existingCustomer)) {
            throw new EmailAlreadyExistsException();
        }
        // null
        CustomerPO newCustomer = new CustomerPO();
        BeanUtils.copyProperties(request, newCustomer);
        newCustomer.setCreatedAt(LocalDateTime.now().toString());

        // database persistence
        customerRepository.save(newCustomer);

        SessionCustomerVO sessionVO = new SessionCustomerVO();
        BeanUtils.copyProperties(newCustomer, sessionVO);

        return sessionVO;
    }

   @Override
    public boolean logIn(UserLoginRequest request) {
        // request to CustomerPO
        CustomerPO existingCustomer = customerRepository.findByEmail(request.getEmail());

        if (existingCustomer == null){
            throw new UserNotFoundException("Account not found for email: " + request.getEmail());
        } else if (!request.getPassword().equals(existingCustomer.getPassword())){
            // wrong password
            throw new PasswordNotValidException("Invalid Password");
        }

        return true;
    }

    @Override
    public CustomerPO findById(Integer id) {
        return null;
    }

    @Override
    public CustomerPO findByEmail(CustomerPO customer) {
        return null;
    }

    @Override
    public List<CustomerPO> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(Integer id) {

    }



}
