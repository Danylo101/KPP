package com.lab.lab10;

public class Tara {
    private final String material;
    private final double width;
    private final double length;
    private final double height;

    public Tara(String material, double width, double length, double height) {
        this.material = material;
        this.width = width;
        this.length = length;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Tara{" +
                "material='" + material + '\'' +
                ", width=" + width +
                ", length=" + length +
                ", height=" + height +
                '}';
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + material.hashCode();
        result = 31 * result + Double.hashCode(width);
        result = 31 * result + Double.hashCode(length);
        result = 31 * result + Double.hashCode(height);
        return result;
    }
}
