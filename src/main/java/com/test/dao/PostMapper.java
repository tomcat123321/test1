package com.test.dao;

import com.test.pojo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.util.List;
@Mapper
public interface PostMapper {

    List<Post> getPosts(
            @Param("from") int from,
            @Param("pageSize") int pageSize);
    @Select("SELECT COUNT(1) FROM post;")
    int getPostCount();

    List<Post> getPost(@Param("title") String title);
}
