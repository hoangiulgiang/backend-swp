package com.lab.lab.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.lab.lab.model.PostFeedback;
import com.lab.lab.repository.PostFeedbackRepository;

@RequiredArgsConstructor
@Service
public class PostFeedbackServiceImpl implements PostFeedbackService {
    
    @Autowired
    private PostFeedbackRepository postFeedbackRepository;
    
    @Override
    public List<PostFeedback> getFeedbackByPostId(Integer postId) {
        return postFeedbackRepository.findByPost_PostID(postId);
    }
    @Override
    public PostFeedback saveFeedback(PostFeedback feedback){
        return postFeedbackRepository.save(feedback);
    }
}
