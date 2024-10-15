package com.lab.lab.service;
import java.util.List;
import com.lab.lab.model.PostFeedback;

public interface PostFeedbackService {
    public List<PostFeedback> getFeedbackByPostId(Integer postID);
        
    public PostFeedback saveFeedback(PostFeedback feedback);
        
    
}
