package com.test.controller;

import com.test.pojo.Post;
import com.test.service.PostService;
import com.test.utils.PagedData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    private PostService postService;
    @RequestMapping("/index")
    public PagedData<Post> index(
            @RequestParam(value="page",defaultValue = "1") int pageIndex){
        int pageSize=3;
        return postService.getPostsInfo(pageIndex,pageSize);
    }
    @RequestMapping("/search")
    public List<Post> search(@RequestParam(value="title",defaultValue = "") String title){
        return postService.getPost(title);
    }
}
