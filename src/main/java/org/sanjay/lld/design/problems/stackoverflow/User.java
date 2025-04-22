package org.sanjay.lld.design.problems.stackoverflow;

import java.util.ArrayList;
import java.util.List;

public class User {
    private Long id;
    private String username;
    private String email;
    private Integer reputation;
    private List<Question> questionAsked;
    private List<Answer> answersGiven;
    private List<Comment> commentsPosted;
    private List<Vote> votesCasted;

    public User(Long id, String username, String email) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.questionAsked = new ArrayList<>();
        this.answersGiven = new ArrayList<>();
        this.commentsPosted = new ArrayList<>();
        this.votesCasted = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public Integer getReputation() {
        return reputation;
    }

    public List<Question> getQuestionAsked() {
        return questionAsked;
    }

    public List<Answer> getAnswersGiven() {
        return answersGiven;
    }

    public List<Comment> getCommentsPosted() {
        return commentsPosted;
    }

    public void setQuestionAsked(List<Question> questionAsked) {
        this.questionAsked = questionAsked;
    }

    public void setAnswersGiven(List<Answer> answersGiven) {
        this.answersGiven = answersGiven;
    }

    public void setCommentsPosted(List<Comment> commentsPosted) {
        this.commentsPosted = commentsPosted;
    }

    public List<Vote> getVotesCasted() {
        return votesCasted;
    }

    public void setVotesCasted(List<Vote> votesCasted) {
        this.votesCasted = votesCasted;
    }
}
