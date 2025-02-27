package com.lab.lab13;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Animation extends JPanel {
    private static final int PERIOD = 350;
    private static final int SHIFT = 10;

    private final Ball ball = new Ball();

    public Animation() {
        Timer timer = new Timer(PERIOD, _ -> {
            ball.setX(ball.getX() + SHIFT);

            double newY = Math.log(Math.abs(ball.getX())) * Math.sin(ball.getX());
            ball.setY(newY);


            if (ball.getX() + ball.getRadius() / 2 > getWidth()) {
                ball.setX(0);
                ball.setY(0);
            }

            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Ellipse2D.Double circle = new Ellipse2D.Double(ball.getX(), ball.getY(), ball.getRadius() * 2, ball.getRadius() * 2);
        g2d.fill(circle);
    }
}
