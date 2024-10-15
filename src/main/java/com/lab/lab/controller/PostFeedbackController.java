package com.lab.lab.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.lab.lab.model.PostFeedback;
import com.lab.lab.service.PostFeedbackService;

@RestController
@RequestMapping("/feedback")
public class PostFeedbackController {
    @Autowired
    private PostFeedbackService postFeedbackService;

    // Get all feedback for a specific post
    @GetMapping("/posts/{postID}")
    public List<PostFeedback> getFeedbackByPost(@PathVariable Integer postId) {
        return postFeedbackService.getFeedbackByPostId(postId);
    }

    // Add new feedback
    @PostMapping
    public PostFeedback addFeedback(@RequestBody PostFeedback postFeedback) {
        postFeedback.setFeedbackDate(java.time.LocalDateTime.now());
        return postFeedbackService.saveFeedback(postFeedback);
    }
}
