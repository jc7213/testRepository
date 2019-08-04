package com.example.springboot.service;

import com.example.springboot.entity.Student;

public interface StudentService {
    public void register(Student stu);
    public int findStudentCount();
    public Student findById(int id);
}
