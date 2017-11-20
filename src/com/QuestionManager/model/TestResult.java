package com.QuestionManager.model;


public class TestResult {
/*    private int answersCorrect;
    private int answersNotCorrect;*/
    private int recruitedScore;
    private int minimumScore;
    private boolean isSuccessful;

    public TestResult(int recruitedScore, int minimumScore, boolean isSuccessful) {
        this.recruitedScore = recruitedScore;
        this.minimumScore = minimumScore;
        this.isSuccessful = isSuccessful;
    }

    public String getResult(){
        String s;
        if(isSuccessful){
            s = "успешно";
        }else {
            s = "неудачно";
        }
        return String.format("Тест завершен - %s! Баллов набрано - %d Балов нужно - %d", s, recruitedScore, minimumScore);
    }

}
