package com.example.springboot.dao;

import com.example.springboot.entity.Student;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface StudentDao {
    public void  save(Student stu);
    public int findCount();
    public Student findById(int stuid);
}
