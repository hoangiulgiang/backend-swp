package com.lab.lab.repository;

import com.lab.lab.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.List;
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findAllByTitleContainingIgnoreCaseOrDescriptionContainingIgnoreCase(String title, String description);


    List<Blog> findAllByCreatedDateAfter(
            LocalDateTime createdDate
    );
    List<Blog> findByDescription(String description);

    
    
}
