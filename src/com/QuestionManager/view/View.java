package com.QuestionManager.view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    public View(String title) throws HeadlessException {
        super(title);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        initPanel();
    }

    public void showFrame() {
        pack();
        setCentreWindow();
        setVisible(true);
    }

    private void setCentreWindow() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - getHeight()) / 2);
        setLocation(x, y);
    }

    protected void initPanel() {
        Box mainBox = Box.createVerticalBox();
        mainBox.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setContentPane(mainBox);
    }

    public void Hide() {
        setVisible(false);
        dispose();
    }
}
