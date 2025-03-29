package com.github.employeesrest.restControllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class healthController {

    @GetMapping("/")
    public ResponseEntity<?> health(){
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/health")
    public ResponseEntity<?> healthAlt(){
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
