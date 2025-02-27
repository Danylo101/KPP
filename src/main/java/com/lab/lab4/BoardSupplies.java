package com.lab.lab4;

import com.lab.utils.InputUtils;

public class BoardSupplies extends WritingUtensils implements Writable{
    private String color;

    public BoardSupplies(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void input() {
        super.input();
        this.color = InputUtils.getInputString("Enter the color of board supply");

    }

    @Override
    public void output() {
        super.output();
        System.out.println("Color of board supply: " + color);
    }
}
