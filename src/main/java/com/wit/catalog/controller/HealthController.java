package com.wit.catalog.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/catalog-service/")
public class HealthController {
    @GetMapping("health")
    public ResponseEntity healthCheck() {
        return ResponseEntity.ok().body("Service is Up");
    }
}
