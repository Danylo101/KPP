package com.lab.lab11;

import javax.swing.*;
import java.awt.Color;

public class WinLab11 extends JFrame {
    public WinLab11(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(150, 350);
        setSize(300, 300);
        getContentPane().setBackground(Color.lightGray);
        addMouseListener(new ActionHandler(this));
    }
}
