package com.lab.lab1;

import com.lab.utils.InputUtils;

public class Lab1Part2 {

    public static void main(String[] args) {
        double a = InputUtils.getInputDouble(true, false, "Enter number a");

        int operation = 0;
        while (operation < 1 || operation > 4) {
            operation = (int) InputUtils.getInputDouble(true, true,
                    "Enter operation (1: Add, 2: Subtract, 3: Multiply, 4: Divide)");
        }

        double b = InputUtils.getInputDouble(true, true, "Enter b (b != 0) number");

        InputUtils.closeScanner();

        System.out.println("Result: " + solve(a, b, operation));
    }

    private static double solve(double a, double b, int operation) {
        return switch (operation) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> a / b;
            default -> {
                System.out.println("Invalid operation.");
                yield 0;
            }
        };
    }
}
