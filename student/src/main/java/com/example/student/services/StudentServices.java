package com.example.student.services;

import com.example.student.feign.TeacherInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class StudentServices {

    private final TeacherInterface teacherInterface;

    public StudentServices(TeacherInterface teacherInterface) {
        this.teacherInterface = teacherInterface;
    }

    public String getStudent(String teacher){
        ResponseEntity<String> response = teacherInterface.getTeacher(teacher);
        return response.getBody() + " also added from teacher";
    }
}
