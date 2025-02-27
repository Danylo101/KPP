package com.lab.lab12;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseClickHandler extends MouseAdapter {
    private final WinLab12 winLab;

    public MouseClickHandler(WinLab12 winLab) {
        this.winLab = winLab;
    }
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1 && e.isControlDown() && e.isShiftDown()) {
            winLab.setLocation(winLab.getLocation().x - 5, winLab.getLocation().y);
        } else if (e.getButton() == MouseEvent.BUTTON2) {
            int x = e.getX();
            int y = e.getY();
            winLab.addPolygon(x, y);
            winLab.addCircle(x, y);
            winLab.repaint();
        }
    }
}
