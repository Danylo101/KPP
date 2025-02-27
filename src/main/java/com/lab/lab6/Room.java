package com.lab.lab6;

import com.lab.utils.InputUtils;

public class Room implements InputOutput {
    private String purpose;
    private double area;

    public Room() {
        this.purpose = "";
        this.area = 0;
    }

    @Override
    public void input() {
        purpose = InputUtils.getInputString("Enter the room purpose");
        area = InputUtils.getInputDouble(false, true, "Enter the room area");
        System.out.println();
    }

    @Override
    public void output() {
        System.out.println("Room purpose: " + purpose + "\nRoom area: " + area);
    }

    public String getPurpose() {
        return purpose;
    }

    public double getArea() {
        return area;
    }
}
