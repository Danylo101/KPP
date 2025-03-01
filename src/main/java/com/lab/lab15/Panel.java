package com.lab.lab15;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    private JTextArea[] inputAreas;
    private JTextField[] outputFields;

    public Panel() {
        super(new BorderLayout());
        add(createToolBar(), BorderLayout.NORTH);
        add(createDataPanel(), BorderLayout.CENTER);
    }

    private JToolBar createToolBar() {
        JToolBar toolBar = new JToolBar(SwingConstants.HORIZONTAL);
        JButton processButton = new JButton("Run");
        JButton clearButton = new JButton("Clear");
        JButton exitButton = new JButton("Exit");

        toolBar.add(processButton);
        toolBar.add(clearButton);
        toolBar.add(exitButton);
        toolBar.setFloatable(false);

        Operation operation = new Operation(this);
        processButton.addActionListener(operation);
        clearButton.addActionListener(operation);
        exitButton.addActionListener(operation);

        return toolBar;
    }

    private JPanel createDataPanel() {
        JPanel mainPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(3, 10, 3, 10);

        String[] inputLabels = {"Enter name:", "Enter weight:", "Enter distance:", "Enter cost:"};
        String[] outputLabels = {"Name:", "Weight:", "Distance:", "Cost:", "Cost per 1 km:"};

        inputAreas = new JTextArea[inputLabels.length];
        outputFields = new JTextField[outputLabels.length];

        addComponents(mainPanel, gbc, inputLabels, inputAreas, true);
        addComponents(mainPanel, gbc, outputLabels, outputFields, false);

        return mainPanel;
    }

    private void addComponents(JPanel panel, GridBagConstraints gbc, String[] labels, JComponent[] components, boolean isTextArea) {
        for (int i = 0; i < labels.length; i++) {
            gbc.gridx = 0;
            gbc.gridy = i + (isTextArea ? 0 : inputAreas.length);
            gbc.weightx = 0;
            gbc.fill = GridBagConstraints.NONE;
            panel.add(new JLabel(labels[i]), gbc);

            gbc.gridx = 1;
            gbc.weightx = 1.0;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            components[i] = isTextArea ? new JTextArea() : new JTextField();
            if (!isTextArea) {
                ((JTextField) components[i]).setEditable(false);
            }
            panel.add(components[i], gbc);
        }
    }

    public JTextArea[] getInputAreas() {
        return inputAreas;
    }

    public JTextField[] getOutputFields() {
        return outputFields;
    }
}