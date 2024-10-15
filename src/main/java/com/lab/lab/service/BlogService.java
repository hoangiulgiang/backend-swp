package com.lab.lab.service;

import com.lab.lab.model.Blog;

import java.time.LocalDateTime;
import java.util.List;

public interface BlogService {
    List<Blog> getAllBlogs();

    List<Blog> searchBlogByKey(String key);

    List<Blog> filteringBlog(LocalDateTime date);

    

    
}
