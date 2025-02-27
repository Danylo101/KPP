package com.lab.lab3;

import com.lab.utils.InputUtils;

public class PostalDispatch {
    private String name;
    private double weight;
    private double distance;
    private double cost;

    public void input() {
        name = InputUtils.getInputString("Enter name");
        weight = InputUtils.getInputDouble(false, true, "Enter weight");
        distance = InputUtils.getInputDouble(false, true, "Enter distance");
        cost = InputUtils.getInputDouble(false, true, "Enter cost");
    }

    public void output() {
        System.out.println("\nName: " + name);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Distance: " + distance + " km");
        System.out.println("Cost: " + cost + " UAH");
        System.out.println(costPerKm());
    }

    public String costPerKm() {
        return "\nCost per 1 km: " + (cost / distance) * weight + " UAH";
    }
}
