package com.lab.lab.controller;

import com.lab.lab.model.Blog;
import com.lab.lab.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/blog")
public class BlogController {
    private final BlogService blogService;

    @GetMapping()
    ResponseEntity<List<Blog>> getAllBlogs(){
        List<Blog> blogs = blogService.getAllBlogs();
        return ResponseEntity.ok(blogs);
    }

    @GetMapping("/search")
    ResponseEntity<List<Blog>> searchBlog(@RequestParam String query){
        List<Blog> blogs = blogService.searchBlogByKey(query);
        return ResponseEntity.ok(blogs);
    }

    @GetMapping("/filter")
    ResponseEntity<List<Blog>> getAllBlogs(@RequestParam("createdDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime createdDate){
        List<Blog> blogs = blogService.filteringBlog(createdDate);
        return ResponseEntity.ok(blogs);
    }
}
