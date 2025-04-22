package com.project.dev.service.impl;

import com.project.dev.entity.Customer;
import com.project.dev.repository.CustomerRepository;
import com.project.dev.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {

    private CustomerRepository customerRepository;

    @Override
    public Customer findById(Integer id) {
        return null;
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    /**
     * Saves a customer (creates if ID is null, updates if ID exists).
     */
    @Override
    public Customer save(Customer customer) {
        // validation
        if (customer == null){
            throw new IllegalArgumentException("Customer cannot be null");
        }

        // New customer (no ID)
        if (customer.getId() == null) {
            Integer newId = generateId();
            customer.setId(newId);
            customer.setCreatedAt(LocalDateTime.now()); // Example: track creation time
        }
        // Existing customer (has ID)
        else {
            customer.setUpdatedAt(LocalDateTime.now()); // Example: track modification
        }

        return customerRepository.save(customer);
    }


    @Override
    public void deleteById(Integer id) {

    }

    private Integer generateId() {
        return 1;
    }
}
