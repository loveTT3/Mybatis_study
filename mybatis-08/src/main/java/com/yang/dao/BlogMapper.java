package com.yang.dao;

import com.yang.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    int addBlog(Blog blog);

    // if
    List<Blog> queryBlogIF(Map map);

    // choose、when、otherwise
    List<Blog> queryBlogChoose(Map map);

    //trim、where、set
    int updateBlog(Map map);

    List<Blog> queryForeach(Map map);
}
