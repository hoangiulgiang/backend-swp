package com.lab.lab.repository;

import com.lab.lab.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PostRepository extends JpaRepository<Post, Integer> {
   
    
}
