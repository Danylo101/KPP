package com.lab.lab14;

import com.lab.lab2.Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Panel extends JPanel implements ActionListener {

    private final JTextField textField1;
    private final JTextField textField2;
    private final JLabel resultLabel;

    public Panel(LayoutManager layout) {
        super(layout);

        textField1 = new JTextField();
        textField2 = new JTextField();
        JButton calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("", SwingConstants.CENTER);

        add(new JLabel("Enter number m:", SwingConstants.CENTER));
        add(textField1);
        add(new JLabel("Enter number n:", SwingConstants.CENTER));
        add(textField2);
        add(new JLabel(""));
        add(calculateButton);
        add(resultLabel);

        calculateButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int m = Integer.parseInt(textField1.getText());
            int n = Integer.parseInt(textField2.getText());

            List<Integer> result = Lab2.solve(m, n);

            resultLabel.setText("Result: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: invalid input");
        }
    }
}
