package com.lab.lab.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.lab.lab.model.Post;
import com.lab.lab.repository.PostRepository;

@RequiredArgsConstructor
@Service
public class PostServiceImpl implements PostService {
      @Autowired // This should be present
    private PostRepository postrepository;
    @Override
    public List<Post> getAllPosts() {
        return postrepository.findAll();
    }
    
}