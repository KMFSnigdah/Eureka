package com.example.student.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("TEACHER-APP")
public interface TeacherInterface {
    @GetMapping("/api/teacher/{name}")
    public ResponseEntity<String> getTeacher(@PathVariable String name);
}
