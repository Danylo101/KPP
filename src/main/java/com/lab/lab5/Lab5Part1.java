package com.lab.lab5;

import com.lab.utils.InputUtils;

public class Lab5Part1 {
    public static void main(String[] args) {

        int size = (int) InputUtils.getInputDouble(false, true, "Enter the size(must be greater than 0) of the array");


        Double[] numbers = new Double[size];

        System.out.println("\nInput array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = InputUtils.getInputDouble(true, false, "Enter the element " + i);
        }

        double a = InputUtils.getInputDouble(true, false, "Enter the lower limit of the range (A)");
        double b = InputUtils.getInputDouble(true, false, "Enter the upper limit of the range (B)");

        InputUtils.closeScanner();

        System.out.println("The number of elements ranges from " + a + " to " + b + ": " + countElements(numbers, a, b));
    }

    private static int countElements(Double[] numbers, double a, double b) {
        int count = 0;
        for (Double element : numbers) {
            if (element != null && element >= a && element <= b) {
                count++;
            }
        }
        return count;
    }
}
