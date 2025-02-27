package com.lab.lab9;

import com.lab.utils.InputUtils;

class Tara implements InputOutput {
    private String material;
    private double width;
    private double length;
    private double height;

    public Tara() {
        this.material = "";
        this.width = 0.0;
        this.length = 0.0;
        this.height = 0.0;
    }


    public void input() {
        this.material = InputUtils.getInputString("Введіть матеріал тари");
        this.width = InputUtils.getInputDouble(false, true, "Введіть ширину тари (м)");
        this.length = InputUtils.getInputDouble(false, true, "Введіть довжину тари (м)");
        this.height = InputUtils.getInputDouble(false, true, "Введіть висоту тари (м)");

    }


    public void output() {
        System.out.println("\nМатеріал тари: " + this.material);
        System.out.println("Ширина: " + this.width + " м");
        System.out.println("Довжина: " + this.length + " м");
        System.out.println("Висота: " + this.height + " м");
    }

    public double lab9() {
        return this.width * this.length * this.height;
    }
}