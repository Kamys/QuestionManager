package com.QuestionManager.model;


public class Question {
    private String questionText;
    private String correctAnswer;
    private String userAnswer;
    private int points;

    public Question(String questionText, String correctAnswer, int points) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public boolean checkAnswer(){
        return correctAnswer.equals(userAnswer);
    }
}
