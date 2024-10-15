package com.lab.lab.repository;
import com.lab.lab.model.PostFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface PostFeedbackRepository extends JpaRepository<PostFeedback, Integer> {
    List<PostFeedback> findByPost_PostID(Integer postID);
}
