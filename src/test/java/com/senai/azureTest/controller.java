package com.senai.azureTest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping
    public ResponseEntity<?> github(){
        return ResponseEntity.ok("CI/CD via github");
    }
}
