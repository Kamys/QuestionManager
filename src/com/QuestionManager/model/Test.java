package com.QuestionManager.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    private String name;
    private int minimumScore;
    private List<Question> questions = new ArrayList<>();
    private Iterator<Question> iteratorQuestions;

    public Test(String name, int minimumScore, List<Question> questions) {
        this.name = name;
        this.minimumScore = minimumScore;
        this.questions = questions;
        this.iteratorQuestions = questions.iterator();
    }

    public boolean hasNextQuestion() {
        return iteratorQuestions.hasNext();
    }

    public Question nextQuestion() {
        return iteratorQuestions.next();
    }


    public TestResult createTestResult() {
        int recruitedScore = countRecruitedScore();
        boolean isSuccessful = minimumScore <= recruitedScore;
        return new TestResult(
                recruitedScore,
                minimumScore,
                isSuccessful);
    }

    /**
     * @return Количество набранных баллов.
     */
    private int countRecruitedScore() {
        int recruitedScore = 0;
        for (Question question : questions) {
            boolean b = question.checkAnswer();
            if (b) {
                recruitedScore = recruitedScore + question.getPoints();
            }
        }
        return recruitedScore;
    }

}
