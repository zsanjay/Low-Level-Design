package org.sanjay.lld.design.problems.stackoverflow;

import java.util.List;

public class StackOverflowDemo {

    public static void main(String[] args) throws Exception {

        StackOverflow stackOverflow  = new StackOverflow();
        // Create Users
        String username1 = stackOverflow.createUser("zsanjay" , "sanjay.mehta@gmail.com");
        String username2 = stackOverflow.createUser("sanjay" , "sanjay.mehta1995@gmail.com");

        // Post Question
        stackOverflow.postQuestion("What is the difference between transient and volatile?", "What is the difference between transient and volatile?" , username1, "Java");

        // Search Question
        Question question = stackOverflow.searchQuestion("What is the difference between transient and volatile?");

        // Post Answer
        Answer answer = stackOverflow.postAnswer("Transient don't serialize the value and in case of volatile value is flushed into main memory", username2, question);

        // Post Comment on Question
        stackOverflow.postComments("Can you explain the difference between atomic and synchronized?" , username2, question , answer , true);

        // Post Comment on Answer
        stackOverflow.postComments("Transient can only be used with non static variables", username1, question , answer, false);

        // Add Vote on Question
        stackOverflow.addVote(username2, question, answer, true , true);

        // Add Vote on Answer
        stackOverflow.addVote(username1, question, answer, false, false);

        // Get Questions by Tag
        System.out.println("Search Question By Tag");
        List<Question> questions = stackOverflow.searchQuestionByTag("Java");
        questions.forEach(ques -> {
            System.out.println(ques.getTitle());
        });

        // Get Question by User
        System.out.println("Search Question By User");
        List<Question> questionsByUser = stackOverflow.searchQuestionByUser(username1);
        questionsByUser.forEach(ques -> {
            System.out.println(ques.getTitle());
        });
    }
}
