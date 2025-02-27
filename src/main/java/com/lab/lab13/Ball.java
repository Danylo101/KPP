package com.lab.lab13;

public class Ball {
    private double x = 0;
    private double y = 0;
    private static final double RADIUS = 20;

    public double getRadius() {
        return RADIUS;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }
}
