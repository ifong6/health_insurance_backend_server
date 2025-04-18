package com.project.dev.controller.healthCheck;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {

    @GetMapping("/db-check")
    public String testConnection() {
        return "Endpoint reached!";  // No DB code yet
    }

    @RestController
    public static class ConnectionTestController {

        @Autowired
        private MongoTemplate mongoTemplate;  // Injected automatically

        @GetMapping("/check")
        public String checkConnection() {
            try {
                // Ping the database (lightweight operation)
                mongoTemplate.getDb().runCommand(new Document("ping", 1));
                return "✅ MongoDB connection successful!";
            } catch (Exception e) {
                return "❌ Connection failed: " + e.getMessage();
            }
        }
    }
}