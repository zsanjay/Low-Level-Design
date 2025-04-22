package org.sanjay.lld.design.problems.stackoverflow;

import java.time.LocalDateTime;

public class Comment {
    private final Long id;
    private final User author;
    private String content;
    private Question question;
    private Answer answer;
    private final LocalDateTime creationDate;

    public Comment(Long id, User author, String content, Question question, Answer answer) {
        this.id = id;
        this.author = author;
        this.content = content;
        this.question = question;
        this.answer = answer;
        this.creationDate = LocalDateTime.now();
    }
    public Long getId() {
        return id;
    }
    public User getAuthor() {
        return author;
    }
    public String getContent() {
        return content;
    }
    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
