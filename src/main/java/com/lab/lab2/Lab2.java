package com.lab.lab2;

import com.lab.utils.InputUtils;

import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {

        int m = (int) InputUtils.getInputDouble(false, true, "Enter number m");
        int n = (int) InputUtils.getInputDouble(false, false, "Enter number n");
        InputUtils.closeScanner();

        List<Integer> numbers = solve(m, n);

        System.out.print("Numbers whose sum of digits is squared equal " + m + ": ");

        if (!numbers.isEmpty()) {
            for (int i = 0; i < numbers.size(); i++) {
                if (i != numbers.size() - 1) {
                    System.out.print(numbers.get(i) + ", ");
                } else {
                    System.out.print(numbers.get(i));
                }
            }
        } else {
            System.out.print("No numbers found.");
        }
    }

    public static int sumNumbers(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static List<Integer> solve(int m, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (sumNumbers(i) * sumNumbers(i) == m) {
                result.add(i);
            }
        }
        return result;
    }
}
