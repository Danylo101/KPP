package com.lab.lab7;

import com.lab.utils.InputUtils;

public class Lab7 {
    public static String removeFirstZhit(String s) {
        int index = s.indexOf("жіт");
        if (index != -1) {
            return s.substring(0, index) + s.substring(index + 3);
        }
        return s;
    }

    public static String insertIzhAfterShi(String s) {
        int index = s.indexOf("ші");
        if (index != -1) {
            return s.substring(0, index + 2) + "іж" + s.substring(index + 2);
        }
        return s;
    }

    public static String copy8CharsAfterJ(String s) {
        int index = s.indexOf("j");
        if (index != -1 && index + 9 <= s.length()) {
            return s.substring(index + 1, index + 9);
        }
        return "";
    }

    public static int countDeInX(String x) {
        int count = 0;
        int index = 0;
        while ((index = x.indexOf("де", index)) != -1) {
            count++;
            index += 2;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = InputUtils.getInputString("Enter S");
        InputUtils.closeScanner();

        String s1 = removeFirstZhit(s);
        System.out.println("Результат 1: " + s1);

        String s2 = insertIzhAfterShi(s);
        System.out.println("Результат 2: " + s2);

        String x = copy8CharsAfterJ(s);
        System.out.println("Результат 3 (X): " + x);

        int count = countDeInX(x);
        System.out.println("Результат 4 (кількість 'де' в X): " + count);


    }
}
