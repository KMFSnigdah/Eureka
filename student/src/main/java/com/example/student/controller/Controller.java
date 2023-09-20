package com.example.student.controller;

import com.example.student.services.StudentServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

    private final StudentServices studentServices;

    public Controller(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping("/student/{teacher}")
    public ResponseEntity<String> getStudent(@PathVariable String teacher){
        String response = studentServices.getStudent(teacher);
        return ResponseEntity.ok(response);
    }
}
