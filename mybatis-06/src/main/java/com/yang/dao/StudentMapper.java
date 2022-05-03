package com.yang.dao;

import com.yang.pojo.Student;

import java.util.List;

public interface StudentMapper {

    // 查询所有的学生和对应的老师信息
    List<Student> getStudent();
    List<Student> getStudent2();
}
