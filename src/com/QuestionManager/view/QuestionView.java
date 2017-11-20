package com.QuestionManager.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionView extends View {

    private final JLabel questionLabel;
    private final JTextField answerTextField;
    private final JButton replyButton;

    public QuestionView() throws HeadlessException {
        super("Вопрос");

        Box boxQuestion = Box.createHorizontalBox();
        boxQuestion.add(new JLabel("Вопрос: "));
        boxQuestion.add(Box.createHorizontalStrut(10));
        questionLabel = new JLabel("В каком году родился А.С. Пушкин?");
        boxQuestion.add(questionLabel);
        add(boxQuestion);

        Box boxInputAnswer = Box.createHorizontalBox();
        boxInputAnswer.add(new JLabel("Ответ: "));
        boxInputAnswer.add(Box.createHorizontalStrut(10));
        answerTextField = new JTextField(15);
        boxInputAnswer.add(answerTextField);

        Box boxButton = Box.createHorizontalBox();
        replyButton = new JButton("Ответить");
        boxButton.add(replyButton);

        add(boxQuestion);
        add(Box.createHorizontalStrut(10));
        add(boxInputAnswer);
        add(boxButton);
    }

    private void reset() {
        for (ActionListener al : replyButton.getActionListeners()) {
            replyButton.removeActionListener(al);
        }
        questionLabel.setText("");
        answerTextField.setText("");
    }

    public void showQuestion(String question, ActionListener replyListener) {
        reset();
        questionLabel.setText(question);
        replyButton.addActionListener(replyListener);
        showFrame();
    }

    public JTextField getAnswerTextField() {
        return answerTextField;
    }
}
