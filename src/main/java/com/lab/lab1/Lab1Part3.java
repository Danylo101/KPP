package com.lab.lab1;

import com.lab.utils.InputUtils;

public class Lab1Part3 {
    public static void main(String[] args) {
        int sideA = (int) InputUtils.getInputDouble(true, true, "Enter side a");
        int sideB = (int) InputUtils.getInputDouble(true, true, "Enter side b");
        int sideC = (int) InputUtils.getInputDouble(true, true, "Enter side c");
        InputUtils.closeScanner();

        if (isRightTriangle(sideA, sideB, sideC)) {
            System.out.println("The triangle is a right triangle.");
        } else {
            System.out.println("The triangle is not a right triangle.");
        }
    }

    private static boolean isRightTriangle(int sideA, int sideB, int sideC) {
        int maxSide = Math.max(sideA, Math.max(sideB, sideC));

        if (maxSide == sideA) {
            return sideB * sideB + sideC * sideC == sideA * sideA;
        } else if (maxSide == sideB) {
            return sideA * sideA + sideC * sideC == sideB * sideB;
        } else {
            return sideA * sideA + sideB * sideB == sideC * sideC;
        }
    }
}
