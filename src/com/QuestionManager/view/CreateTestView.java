package com.QuestionManager.view;

import javax.swing.*;
import java.awt.*;

public class CreateTestView extends BaseJFrame {
    public CreateTestView() throws HeadlessException {
        super("Добавление теста");

        Box boxTestName = Box.createHorizontalBox();
        boxTestName.add(new JLabel("Имя теста: "));
        boxTestName.add(Box.createHorizontalStrut(10));
        boxTestName.add(new JTextField(15));

        Box boxNumberQuestions = Box.createHorizontalBox();
        boxNumberQuestions.add(new JLabel("Количество вопросов: "));
        boxNumberQuestions.add(Box.createHorizontalStrut(10));
        boxNumberQuestions.add(new JTextField(15));

        Box boxMinimumPoints = Box.createHorizontalBox();
        boxMinimumPoints.add(new JLabel("Минимальный порог баллов: "));
        boxMinimumPoints.add(Box.createHorizontalStrut(10));
        boxMinimumPoints.add(new JTextField(15));

        Box boxButtons = Box.createHorizontalBox();
        boxButtons.add(new JButton("Добавить вопрос"));
        boxButtons.add(Box.createHorizontalStrut(10));
        boxButtons.add(new JButton("Сохранить"));

        add(boxTestName);
        add(Box.createVerticalStrut(3));
        add(boxNumberQuestions);
        add(Box.createVerticalStrut(3));
        add(boxMinimumPoints);
        add(Box.createVerticalStrut(3));
        add(boxButtons);
    }


}
