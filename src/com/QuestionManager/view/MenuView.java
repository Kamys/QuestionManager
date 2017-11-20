package com.QuestionManager.view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuView extends View {

    public MenuView() throws HeadlessException {
        super("Меню");

        initPadding(10);

        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
        JButton passTest = new JButton("Пройти тест");
        passTest.addActionListener(new PassTestListener());
        passTest.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton addTest = new JButton("Добавить тест");
        addTest.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(passTest);
        add(Box.createVerticalStrut(10));
        add(addTest);
    }

    @Override
    public void showFrame() {
        super.showFrame();
        setSize(200,120);
    }

    private void initPadding(int padding) {
        Border border = BorderFactory.createEmptyBorder(padding, padding, padding, padding);
        JPanel contentPanel = new JPanel();
        contentPanel.setBorder(border);
        setContentPane(contentPanel);
    }

    private class PassTestListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            View frame = new QuestionView();
            frame.showFrame();
        }
    }
}
