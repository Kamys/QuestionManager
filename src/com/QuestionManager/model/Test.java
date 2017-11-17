package com.QuestionManager.model;

import java.util.ArrayList;
import java.util.List;

public class Test {
    private String name;
    private int numberQuestions;
    private int minimumPoints;
    private List<Question> questions = new ArrayList<>();

    public Test(String name, int numberQuestions, int minimumPoints, List<Question> questions) {
        this.name = name;
        this.numberQuestions = numberQuestions;
        this.minimumPoints = minimumPoints;
        this.questions = questions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberQuestions() {
        return numberQuestions;
    }

    public void setNumberQuestions(int numberQuestions) {
        this.numberQuestions = numberQuestions;
    }

    public int getMinimumPoints() {
        return minimumPoints;
    }

    public void setMinimumPoints(int minimumPoints) {
        this.minimumPoints = minimumPoints;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }
}
