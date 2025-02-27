package com.lab.lab6;

import com.lab.utils.InputUtils;

public class Lab6 {
    public static void main(String[] args) {
        Flat flat = new Flat();
        flat.input();
        InputUtils.closeScanner();
        flat.output();

        double nonResidentialPercentage = flat.calculateNonResidentialAreaPercentage();
        System.out.println("Non-residential area percentage: " + nonResidentialPercentage + "%");

        double searchArea = 15.0;
        System.out.println(flat.findRoomsByArea(searchArea));
    }
}
