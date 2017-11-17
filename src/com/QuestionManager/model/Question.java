package com.QuestionManager.model;


import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Question {
    private String QuestionText;
    private String Answer;

    public Question(String questionText, String answer) {
        QuestionText = questionText;
        Answer = answer;
    }

    public String getQuestionText() {
        return QuestionText;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public boolean checkAnsver(){
        throw new NotImplementedException();
    }
}
