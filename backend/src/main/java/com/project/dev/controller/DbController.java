package com.dev.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController
public class DbController {

    @GetMapping("/db-check")
    public String testConnection() {
        return "Endpoint reached!";  // No DB code yet
    }
}