package com.lab.lab13;

import javax.swing.*;

public class Lab13 {
    public static void main(String[] args) {
        JFrame window = new JFrame("My Animation");
        Animation animation = new Animation();
        window.add(animation);

        window.setSize(800, 600);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
