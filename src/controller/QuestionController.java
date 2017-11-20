package controller;


import com.QuestionManager.model.Question;
import com.QuestionManager.model.Test;
import com.QuestionManager.model.TestResult;
import com.QuestionManager.view.QuestionView;

import javax.swing.*;

public class QuestionController {
    private Test test;
    private QuestionView questionView;

    public QuestionController(Test test) {
        this.test = test;
        questionView = new QuestionView();
    }

    public void Show() {
        if (!test.hasNextQuestion()) {
            completion();
            return;
        }
        Question question = test.nextQuestion();
        questionView.showQuestion(question.getQuestionText(), e -> {
            String answer = questionView.getAnswerTextField().getText();
            question.setUserAnswer(answer);
            nextQuestion();
        });
    }

    private void nextQuestion() {
        Show();
    }

    private void completion() {
        TestResult result = test.createTestResult();
        JOptionPane.showMessageDialog(questionView, result.getResult());
        questionView.Hide();
    }
}
