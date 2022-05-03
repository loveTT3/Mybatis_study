package com.yang.dao;

import com.yang.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    // 获取老师
    List<Teacher> getTeacher();

    // 获取老师 及老师下的所有学生  结果嵌套
    Teacher getTeacher2(@Param("id") int id);

    // 获取老师 及老师下的所有学生  子查询
    Teacher getTeacher3(@Param("id") int id);
}
