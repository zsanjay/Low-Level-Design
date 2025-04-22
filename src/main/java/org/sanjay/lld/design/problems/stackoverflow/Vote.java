package org.sanjay.lld.design.problems.stackoverflow;

import java.time.LocalDateTime;

public class Vote {
    private Long id;
    private User voter;      // The user who cast the vote
    private boolean isUpvote; // Boolean indicating if it's an upvote (true) or downvote (false)
    private Question question;  // The question this vote is for (optional)
    private Answer answer;
    private LocalDateTime localDateTime;

    public Vote(Long id, User user, Question question, Answer answer , boolean isUpvote) {
        this.id = id;
        this.voter = user;
        this.question = question;
        this.answer = answer;
        this.isUpvote = isUpvote;
        this.localDateTime = LocalDateTime.now();
    }
    public Long getId() {
        return id;
    }

    public User getVoter() {
        return voter;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
