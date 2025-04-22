package com.project.dev.repository;

import com.project.dev.entity.Customer;
import org.springframework.data.repository.CrudRepository;

/**
    Customer: The entity class your repository manages (e.g., @Entity public class Customer { ... })
    Integer: The type of the entity's primary key (@Id private Integer id;)
 */
public interface CustomerRepository
        extends CrudRepository<Customer, Integer> {

}

