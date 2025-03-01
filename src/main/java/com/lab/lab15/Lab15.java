package com.lab.lab15;

import javax.swing.*;
import java.awt.*;


public class Lab15 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Lab 14");
        Panel panel = new Panel();
        window.add(panel);

        window.setSize(300, 300);
        window.setMinimumSize(new Dimension(200, 300));
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
