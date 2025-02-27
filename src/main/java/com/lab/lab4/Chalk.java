package com.lab.lab4;

import com.lab.utils.InputUtils;

public class Chalk extends BoardSupplies implements Writable{
    private String hardness;

    public Chalk(String color, String hardness) {
        super("Chalk", color);
        this.hardness = hardness;
    }

    @Override
    public void input() {
        super.input();
        this.hardness = InputUtils.getInputString("Enter the hardness of chalk");
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Hardness of chalk: " + hardness);
    }
}
