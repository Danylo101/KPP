package com.lab.lab8;

import com.lab.utils.InputUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab8 {
    public static String findFirstLexemeTwice(String text) {
        String[] lexemes = text.split("[\\s.,!?]+");
        Map<String, Integer> lexemeCounts = new HashMap<>();
        Map<String, Integer> lexemeIndices = new HashMap<>();

        for (int i = 0; i < lexemes.length; i++) {
            String lexeme = lexemes[i];
            if (!lexeme.isEmpty()) {
                lexemeCounts.put(lexeme, lexemeCounts.getOrDefault(lexeme, 0) + 1);
                if (!lexemeIndices.containsKey(lexeme)) {
                    lexemeIndices.put(lexeme, i + 1);
                }
            }
        }

        for (String lexeme : lexemes) {
            if (lexemeCounts.getOrDefault(lexeme, 0) == 2) {
                return "Номер: " + lexemeIndices.get(lexeme) + ", Довжина: " + lexeme.length();
            }
        }

        return "Номер: -1";
    }

    public static List<String> findAllLexemesTwice(String text) {
        String[] lexemes = text.split("[\\s.,!?]+");
        Map<String, Integer> lexemeCounts = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (String lexeme : lexemes) {
            if (!lexeme.isEmpty()) {
                lexemeCounts.put(lexeme, lexemeCounts.getOrDefault(lexeme, 0) + 1);
            }
        }

        for (String lexeme : lexemes) {
            if (lexemeCounts.getOrDefault(lexeme, 0) == 2 && !result.contains(lexeme)) {
                result.add(lexeme);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String text = InputUtils.getInputString("Введіть рядок");
        InputUtils.closeScanner();

        System.out.println("Результат 1: " + findFirstLexemeTwice(text));
        System.out.println("Результат 2: " + findAllLexemesTwice(text));

    }
}
