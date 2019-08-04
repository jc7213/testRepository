package com.example.springboot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource(value = "classpath:user.properties",encoding = "utf-8")
@ConfigurationProperties("user")
public class User {
    private int id;
    private String sname;
    private int age;
    private List<Student> studentList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", age=" + age +
                ", studentList=" + studentList +
                '}';
    }
}
