package com.example.teacher.Services;

import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    public String getTeacher(String name) {
        return "I AM FROM TEACHER SERVICES " + name;
    }
}
