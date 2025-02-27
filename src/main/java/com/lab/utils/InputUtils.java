package com.lab.utils;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InputUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getInputString(String message) {
        System.out.print(message + ": ");
        return scanner.nextLine();
    }

    /**
     * @param negative        If true can double negative integer
     * @param greaterThenZero If false can return zero
     * @return Double number
     */
    public static double getInputDouble(boolean negative, boolean greaterThenZero, String message) {
        double input;
        System.out.print(message + ": ");
        while (true) {
            if (scanner.hasNextDouble()) {
                input = scanner.nextDouble();

                if (!negative && input < 0) {
                    System.out.println("Invalid number. Please enter a positive number.");
                    System.out.print(message + ": ");
                } else if (greaterThenZero && input == 0) {
                    System.out.println("Invalid number. Number must be greater than zero.");
                    System.out.print(message + ": ");
                } else {
                    return input;
                }
            } else {
                System.out.println("Invalid number. Please enter a valid number.");
                System.out.print(message + ": ");
                scanner.next();
            }
        }
    }

    public static String getValidDateInput(String message) {
        while (true) {
            System.out.print(message + ": ");
            String input = scanner.nextLine();

            try {
                LocalDate.parse(input);
                return input;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in YYYY-MM-DD format.");
            }
        }
    }

    public static void nexLine() {
        scanner.nextLine();
    }


    public static void closeScanner() {
        scanner.close();
    }
}
