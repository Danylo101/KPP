package com.lab.lab4;

import com.lab.utils.InputUtils;

public class WritingUtensils implements Writable {
    private String name;

    public WritingUtensils(String name) {
        this.name = name;
    }

    @Override
    public void input() {
        name = InputUtils.getInputString("Enter the name of the writing utensil");
    }

    @Override
    public void output() {
        System.out.println("Name of the writing utensil: " + name);
    }

    @Override
    public String getName() {
        return name;
    }
}
