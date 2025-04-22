package com.project.dev.service;

import com.project.dev.entity.Customer;

import java.util.List;

public interface ICustomerService {
    Customer findById(Integer id);

    List<Customer> findAll();

    Customer save(Customer customer);

    void deleteById(Integer id);
}
