package com.lab.lab14;

import javax.swing.*;
import java.awt.*;

public class Lab14 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Lab 14");
        Panel panel = new Panel(new GridLayout(4, 2));
        window.add(panel);

        window.setSize(500, 200);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
