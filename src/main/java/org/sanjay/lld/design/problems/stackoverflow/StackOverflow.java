package org.sanjay.lld.design.problems.stackoverflow;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class StackOverflow {
    private static final Random random = new Random();
    private static final Map<String, User> userTable = new ConcurrentHashMap<>();
    private static final Map<String, Question> questionTable = new ConcurrentHashMap<>();
    private static final Map<String, List<Answer>> answerTable = new ConcurrentHashMap<>();

    public String createUser(String username , String email) throws Exception {
        if(userTable.containsKey(username)) {
            throw new Exception("User with the username "+ username + " is already exists");
        }

        User user = new User(random.nextLong() , username, email);
        userTable.put(username , user);
        System.out.println("User successfully created with username " + user.getUsername());
        return user.getUsername();
    }

    public void postQuestion(String title, String content, String username, String tagName) throws Exception{
        if(questionTable.containsKey(title)) {
            throw new Exception("Question with the title "+ title + " is already exists");
        }
        User author = userTable.get(username);
        Question question = new Question(random.nextLong(), title, content, author);
        Tag tag = new Tag(random.nextLong(), tagName);
        question.getTags().add(tag);
        author.getQuestionAsked().add(question);
        userTable.put(username, author);
        questionTable.put(title, question);
        System.out.println("Question is posted Successfully");
    }

    public Answer postAnswer(String content, String username, Question question) {

        User author = userTable.get(username);
        Answer answer = new Answer(random.nextLong(), content, author, question);
        author.getAnswersGiven().add(answer);
        userTable.put(username, author);
        questionTable.get(question.getTitle()).getAnswers().add(answer);
        List<Answer> answers = answerTable.get(question.getTitle());
        if(answers == null) {
            answers = new ArrayList<>();
        }
        answers.add(answer);
        answerTable.put(question.getTitle() , answers);
        return answer;
    }

    public void postComments(String commentContent, String username, Question question, Answer answer, boolean isForQuestion) {

        User author = userTable.get(username);
        Comment comment = new Comment(random.nextLong(), author, commentContent, question, answer);
        author.getCommentsPosted().add(comment);
        userTable.put(username, author);

        if(isForQuestion) {
            questionTable.get(question.getTitle()).getComments().add(comment);
        } else {
            addCommentToAnswer(question.getTitle(), answer, comment);
        }
        System.out.println("Comment is posted successfully");
    }

    private void addCommentToAnswer(String title, Answer answer, Comment comment) {
        Answer ans = getAnswer(title, answer);
        if(Objects.nonNull(ans)) {
            ans.getComments().add(comment);
        }
    }

    private Answer getAnswer(String username, Answer answer) {
        return answerTable.get(username).stream().filter(ans -> ans.getId().equals(answer.getId())).findFirst().orElse(null);
    }

    public void addVote(String username, Question question, Answer answer , boolean isUpvote, boolean isForQuestion) {
        User user = userTable.get(username);

        Vote vote = new Vote(random.nextLong(), user, question, answer, isUpvote);
        user.getVotesCasted().add(vote);

        if(isForQuestion) {
            questionTable.get(question.getTitle()).getVotes().add(vote);
        } else {
            Answer ans = getAnswer(question.getTitle(), answer);
            if(Objects.nonNull(ans)) {
                ans.getVote().add(vote);
            }
        }
        System.out.println("Vote is successfully added");
    }

    public Question searchQuestion(String title) throws Exception {
        Question question = questionTable.get(title);
        if(question == null) {
            throw new Exception("No Question found with this title");
        }
        return question;
    }

    public List<Question> searchQuestionByTag(String tagName) {
        List<Question> questions = new ArrayList<>();
        questionTable.values().forEach(question -> {
            boolean isTagPresent = question.getTags().stream().anyMatch(tag -> tag.getName().equals(tagName));
            if(isTagPresent) {
                questions.add(question);
            }
        });
        return questions;
    }

    public List<Question> searchQuestionByUser(String username) {
        return questionTable.values().stream().filter(question -> question.getAuthor().getUsername().equals(username)).collect(Collectors.toList());
    }


}
