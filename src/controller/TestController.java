package controller;


import com.QuestionManager.model.Question;
import com.QuestionManager.model.Test;
import com.QuestionManager.model.TestResult;
import com.QuestionManager.view.QuestionView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestController {
    private Test test;
    private QuestionView questionView;

    public TestController(Test test) {
        this.test = test;
        questionView = new QuestionView();
    }

    public void Show() {
        if (test.hasNextQuestion()) {
            Question question = test.nextQuestion();
            questionView.showQuestion(question.getQuestionText(), new MyActionListener(question));
        } else {
            completion();
        }
    }

    private void nextQuestion() {
        Show();
    }

    private void completion() {
        TestResult result = test.createTestResult();
        JOptionPane.showMessageDialog(questionView, result.getResult());
        questionView.Hide();
    }

    private class MyActionListener implements ActionListener {
        private final Question question;

        public MyActionListener(Question question) {
            this.question = question;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String answer = questionView.getAnswerTextField().getText();
            question.setUserAnswer(answer);
            TestController.this.nextQuestion();
        }
    }
}
