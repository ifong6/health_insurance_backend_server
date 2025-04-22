package com.project.dev.entity.vo;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SessionCustomerVO {
    private String firstName;
    private String lastName;
    private LocalDate DOB;
    private String email;
    private String policyNo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
