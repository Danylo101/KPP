package com.lab.lab3;

import com.lab.utils.InputUtils;

public class Lab3 {
    public static void main(String[] args) {
        PostalDispatch postalDispatch = new PostalDispatch();

        postalDispatch.input();
        InputUtils.closeScanner();

        postalDispatch.output();
    }
}
