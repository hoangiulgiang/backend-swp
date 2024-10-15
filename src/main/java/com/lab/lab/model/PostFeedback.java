package com.lab.lab.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "post_feedback")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PostFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "feedbackID")
    private Integer feedbackID;

    @ManyToOne
    @JoinColumn(name = "postID", nullable = false)
    private Post post;

    @ManyToOne
    @JoinColumn(name = "accountID", nullable = false)
    private Account account;

    @Column(name = "feedbackText")
    private String feedbackText;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "feedbackDate")
    private LocalDateTime feedbackDate;
}
