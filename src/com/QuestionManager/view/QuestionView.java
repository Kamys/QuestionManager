package com.QuestionManager.view;

import javax.swing.*;
import java.awt.*;

public class QuestionView extends BaseJFrame {

    private final JLabel question;
    private final JLabel inputAnswer;

    public QuestionView() throws HeadlessException {
        super("Вопрос");

        Box boxQuestion = Box.createHorizontalBox();
        boxQuestion.add(new JLabel("Вопрос: "));
        boxQuestion.add(Box.createHorizontalStrut(10));
        question = new JLabel("В каком году родился А.С. Пушкин?");
        boxQuestion.add(question);
        add(boxQuestion);

        Box boxInputAnswer = Box.createHorizontalBox();
        inputAnswer = new JLabel("Ответ: ");
        boxInputAnswer.add(inputAnswer);
        boxInputAnswer.add(Box.createHorizontalStrut(10));
        boxInputAnswer.add(new JTextField(15));

        Box boxButton = Box.createHorizontalBox();
        boxButton.add(new JButton("Ответить"));

        add(boxQuestion);
        add(Box.createHorizontalStrut(10));
        add(boxInputAnswer);
        add(boxButton);
    }

    public JLabel getQuestion() {
        return question;
    }

    public JLabel getInputAnswer() {
        return inputAnswer;
    }
}
