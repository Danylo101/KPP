package com.lab.lab5;

import com.lab.utils.InputUtils;

public class Lab5Part2 {
    public static void main(String[] args) {
        int n = (int) InputUtils.getInputDouble(false, true, "Enter number n");
        int m = (int) InputUtils.getInputDouble(false, true, "Enter number m");


        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = (int) InputUtils.getInputDouble(true, false,
                        "Enter number " + i + " and " + j);
            }
        }
        InputUtils.closeScanner();

        checkOddElementsInColumns(matrix);
    }

    private static void checkOddElementsInColumns(int[][] matrix) {
        int m = matrix[0].length;

        for (int j = 0; j < m; j++) {
            boolean hasOdd = false;
            for (int[] num : matrix) {
                if (num[j] % 2 != 0) {
                    hasOdd = true;
                    break;
                }
            }
            if (hasOdd) {
                System.out.println("In column " + (j + 1) + " there are odd elements.");
            } else {
                System.out.println("In column " + (j + 1) + " there are no odd elements.");
            }
        }
    }
}
