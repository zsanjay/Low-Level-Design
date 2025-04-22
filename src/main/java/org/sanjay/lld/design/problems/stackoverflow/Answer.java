package org.sanjay.lld.design.problems.stackoverflow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class Answer {
    private Long id;
    private String content;
    private User author;
    private Question associatedQuestion;
    private List<Comment> comments;
    private List<Vote> vote;
    private LocalDateTime creationDate;

    public Answer(Long id, String content, User author, Question question) {
        this.id = id;
        this.content = content;
        this.author = author;
        this.associatedQuestion = question;
        this.creationDate = LocalDateTime.now();
        this.comments = new ArrayList<>();
        this.vote = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public Question getAssociatedQuestion() {
        return associatedQuestion;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Vote> getVote() {
        return vote;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
