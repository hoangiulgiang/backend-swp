package com.lab.lab.service;

import com.lab.lab.model.Blog;
import com.lab.lab.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogServiceImpl implements BlogService {
    private final BlogRepository blogRepository;

    @Override
    public List<Blog> getAllBlogs() {
        return blogRepository.findAll();
    }

    @Override
    public List<Blog> searchBlogByKey(String key) {
        return blogRepository.findAllByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(key, key);
    }

    @Override
    public List<Blog> filteringBlog(LocalDateTime date) {
        return blogRepository.findAllByCreatedDateAfter(date);
    }

   
   
}
