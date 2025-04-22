package com.project.dev.entity.po;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class CustomerPO {
    private Integer customer_id;
    private String firstName;
    private String lastName;
    private String DOB;
    private String email;
    private String password;
    private String policyNumber;
    private String createdAt;
    private String updatedAt;
}
