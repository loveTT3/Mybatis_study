package com.yang.dao;


import com.yang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();


    // 方法存在多个参数，所有的参数前面必须加上@param注解
    @Select("select * from user where id = #{idd}" )
    User getUserById(@Param("idd") int id);

    @Insert("insert into user (id,name,pwd) values(#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name = #{name} ,pwd = #{password} where  id = #{id}")
    int updateUser(User user);

    @Delete("delete from user where id = #{id}")
    int delete(@Param("id") int id);

}
