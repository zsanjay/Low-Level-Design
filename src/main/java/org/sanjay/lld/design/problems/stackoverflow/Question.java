package org.sanjay.lld.design.problems.stackoverflow;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;
public class Question {
    private final Long id;
    private String title;
    private String content;
    private User author;
    private List<Answer> answers;
    private List<Comment> comments;
    private List<Tag> tags;
    private List<Vote> votes;
    private final LocalDateTime creationDate;

    public Question(Long id, String title, String content, User author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.author = author;
        this.creationDate = LocalDateTime.now();
        this.answers = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.tags = new ArrayList<>();
        this.votes = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public User getAuthor() {
        return author;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }
}
