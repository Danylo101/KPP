package com.lab.lab9;

import com.lab.utils.InputUtils;

public class Lab9 {
    public static void main(String[] args) {
        InputOutput[] objects = new InputOutput[3];
        objects[1] = new PostalDispatch();
        objects[0] = new Tara();
        objects[2] = new ElectroDevice();

        for (InputOutput obj : objects) {
            obj.input();
            obj.output();
            System.out.println("Результат lab9(): " + obj.lab9());
            System.out.println();
            InputUtils.nexLine();
        }

        InputUtils.closeScanner();
    }
}
