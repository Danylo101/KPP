package com.lab.lab9;

import com.lab.utils.InputUtils;

public class PostalDispatch implements InputOutput {
    private String name;
    private double weight;
    private double distance;
    private double cost;

    public PostalDispatch() {
        this.name = "";
        this.weight = 0.0;
        this.distance = 0.0;
        this.cost = 0.0;
    }

    @Override
    public void input() {
        name = InputUtils.getInputString("Enter name");
        weight = InputUtils.getInputDouble(false, true, "Enter weight");
        distance = InputUtils.getInputDouble(false, true, "Enter distance");
        cost = InputUtils.getInputDouble(false, true, "Enter cost");
    }

    @Override
    public void output() {
        System.out.println("\nName: " + name);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Cost: " + cost + " UAH");
    }

    @Override
    public double lab9() {
        return (cost / distance) * weight;
    }
}
