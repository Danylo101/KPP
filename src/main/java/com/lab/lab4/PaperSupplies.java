package com.lab.lab4;

import com.lab.utils.InputUtils;

public class PaperSupplies extends WritingUtensils implements Writable {

    private String type;

    public PaperSupplies(String name, String type) {
        super(name);
        this.type = type;
    }
    @Override
    public void input() {
        super.input();
        this.type = InputUtils.getInputString("Enter the type of paper supply");
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Type of paper supply: " + type);
    }
}
