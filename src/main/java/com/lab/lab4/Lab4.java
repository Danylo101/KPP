package com.lab.lab4;

import com.lab.utils.InputUtils;

public class Lab4 {
    public static void main(String[] args) {
        Writable generalUtensil = new WritingUtensils("General utensil");
        Writable paperUtensil = new PaperSupplies("Pen", "BallPoint");
        Writable boardUtensil = new BoardSupplies("Marker", "Black");
        Writable chalk = new Chalk("White", "Medium");

        System.out.println("Input for " + generalUtensil.getName());
        generalUtensil.input();

        System.out.println("\nInput for " + paperUtensil.getName());
        paperUtensil.input();

        System.out.println("\nInput for " + boardUtensil.getName());
        boardUtensil.input();

        System.out.println("\nInput for " + chalk.getName());
        chalk.input();

        InputUtils.closeScanner();

        System.out.println("\nOutputting data:\n");
        System.out.println("Output for " + generalUtensil.getName());
        generalUtensil.output();

        System.out.println("\nOutput for " + paperUtensil.getName());
        paperUtensil.output();

        System.out.println("\nOutput for " + boardUtensil.getName());
        boardUtensil.output();

        System.out.println("\nOutput for " + chalk.getName());
        chalk.output();
    }
}
