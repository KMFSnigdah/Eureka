package com.example.teacher.Controller;

import com.example.teacher.Services.TeacherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teacher/{name}")
    public ResponseEntity<String> getTeacher(@PathVariable String name){
       String response = teacherService.getTeacher(name);
       return ResponseEntity.ok(response);
    }
}
