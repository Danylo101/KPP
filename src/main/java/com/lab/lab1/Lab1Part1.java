package com.lab.lab1;

import com.lab.utils.InputUtils;

public class Lab1Part1 {

    public static void main(String[] args) {

        while (true) {
            String number = InputUtils.getInputString("Enter number");

            if (number.length() >= 3) {
                System.out.println("Result for third digit (left): " +
                        solve(Character.getNumericValue(number.charAt(2))));

                System.out.println("Result for second-to-last digit (right): " +
                        solve(Character.getNumericValue(number.charAt(number.length() - 3))));
                break;
            } else {
                System.out.println("Number is smaller than 3. Please enter a valid number.\n");
            }
        }
        InputUtils.closeScanner();
    }

    private static String solve(int number) {
        if (number % 2 == 0) {
            return String.valueOf((number / 2) * (number / 2));
        } else {
            return "The digit is not even";
        }
    }
}
