package com.test.service.impl;

import com.test.dao.PostMapper;
import com.test.pojo.Post;
import com.test.service.PostService;
import com.test.utils.PagedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostMapper postMapper;
    @Override
    public PagedData<Post> getPostsInfo(int pageIndex, int pageSize) {
        int totalCount = postMapper.getPostCount();
        int from=(pageIndex-1)*pageSize;
        List<Post> list = postMapper.getPosts(from, pageSize);
        PagedData<Post> pages=new PagedData<>(pageIndex,pageSize,totalCount,list);
        return pages;
    }

    @Override
    public List<Post> getPost(String title) {
        return postMapper.getPost(title);
    }
}
