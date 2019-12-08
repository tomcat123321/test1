package com.test.service;

import com.test.pojo.Post;
import com.test.utils.PagedData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostService {

    PagedData<Post> getPostsInfo(int pageIndex,int pageSize);

    List<Post> getPost(String title);
}
