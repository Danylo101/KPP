package com.lab.lab1;

import com.lab.utils.InputUtils;

import java.time.LocalDate;


public class Lab1Part4 {
    public static void main(String[] args) {
        String firstDate = InputUtils.getValidDateInput("Enter first date in YYYY-MM-DD format");
        String secondDate = InputUtils.getValidDateInput("Enter second date in YYYY-MM-DD format");
        InputUtils.closeScanner();

        LocalDate first = LocalDate.parse(firstDate);
        LocalDate second = LocalDate.parse(secondDate);

        if (first.isBefore(second)) {
            System.out.println("The first person is older.");
        } else if (first.isAfter(second)) {
            System.out.println("The second person is older.");
        } else {
            System.out.println("Both persons have the same birthday.");
        }
    }
}
