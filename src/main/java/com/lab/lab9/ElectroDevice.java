package com.lab.lab9;

import com.lab.utils.InputUtils;

public class ElectroDevice implements InputOutput{
    private String name;
    private double current;
    private double voltage;

    public ElectroDevice() {
        this.name = "";
        this.current = 0.0;
        this.voltage = 0.0;
    }

    public void input() {
        this.name = InputUtils.getInputString("Введіть назву приладу");
        this.current = InputUtils.getInputDouble(false, true, "Введіть силу струму (А)");
        this.voltage = InputUtils.getInputDouble(false, true, "Введіть напругу (В)");
    }

    public void output() {
        System.out.println("\nНазва приладу: " + this.name);
        System.out.println("Сила струму: " + this.current + " А");
        System.out.println("Напруга: " + this.voltage + " В");
    }

    public double lab9() {
        return this.current * this.voltage;
    }
}
