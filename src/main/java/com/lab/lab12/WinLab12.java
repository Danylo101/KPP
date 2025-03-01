package com.lab.lab12;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WinLab12 extends JFrame {
    private static final int R = 15;
    private static final int N = 4;

    private final List<Polygon> polygons = new ArrayList<>();
    private final List<Point> circles = new ArrayList<>();

    public WinLab12(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(150, 350);
        setSize(300, 300);
        getContentPane().setBackground(Color.lightGray);

        addMouseListener(new MouseClickHandler(this));
    }

    private Polygon createPolygon(int x, int y) {
        Polygon polygon = new Polygon();
        for (int i = 0; i < N; i++) {
            double angle = 2 * Math.PI * i / N;
            int px = (int) (x + R * Math.cos(angle));
            int py = (int) (y + R * Math.sin(angle));
            polygon.addPoint(px, py);
        }
        return polygon;
    }

    public void addPolygon(int x, int y) {
        polygons.add(createPolygon(x, y));
    }

    public void addCircle(int x, int y) {
        circles.add(new Point(x, y));
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        for (Polygon polygon : polygons) {
            g.drawPolygon(polygon);
        }

        g.setColor(Color.RED);
        for (Point p : circles) {
            g.drawOval(p.x - R, p.y - R, 2 * R, 2 * R);
        }

    }

}
