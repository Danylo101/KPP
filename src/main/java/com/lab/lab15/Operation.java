package com.lab.lab15;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operation implements ActionListener {

    private final Panel panel;

    public Operation(Panel panel) {
        this.panel = panel;
    }

    public void run() {
        JTextArea[] inputAreas = panel.getInputAreas();
        JTextField[] outputFields = panel.getOutputFields();

        for (JTextArea area : inputAreas) {
            if (area.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(panel, "Please fill in all fields.");
                return;
            }
        }

        try {
            String name = inputAreas[0].getText().trim();
            double weight = Double.parseDouble(inputAreas[1].getText().trim());
            double distance = Double.parseDouble(inputAreas[2].getText().trim());
            double cost = Double.parseDouble(inputAreas[3].getText().trim());

            if (weight <= 0 || distance <= 0 || cost <= 0) {
                JOptionPane.showMessageDialog(panel, "Weight, distance and cost must be positive.");
                return;
            }

            double costPerKm = cost / distance;

            outputFields[0].setText(name);
            outputFields[1].setText(String.valueOf(weight));
            outputFields[2].setText(String.valueOf(distance));
            outputFields[3].setText(String.valueOf(cost));
            outputFields[4].setText(String.format("%.2f", costPerKm));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(panel, "Invalid input. Please enter numbers for weight, distance, and cost.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panel, "An error occurred: " + e.getMessage());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Run":
                run();
                break;
            case "Clear":
                for (JTextArea inputField : panel.getInputAreas()) {
                    inputField.setText("");
                }
                for (JTextField outputField : panel.getOutputFields()) {
                    outputField.setText("");
                }
                break;
            case "Exit":
                System.exit(0);
                break;
        }
    }
}