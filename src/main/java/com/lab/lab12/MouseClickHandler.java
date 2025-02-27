package com.lab.lab12;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class ActionHandler extends MouseAdapter {
    private final WinLab12 winLab;

    public ActionHandler(WinLab12 winLab) {
        this.winLab = winLab;
    }
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1 && e.isControlDown() && e.isShiftDown()) {
            winLab.setLocation(winLab.getLocation().x - 5, winLab.getLocation().y);
        }
    }

    public void mouseWheelMoved(MouseWheelEvent e) {
        if (e.getWheelRotation() != 0) {
            int x = e.getX();
            int y = e.getY();
            winLab.addPolygon(x, y);
            winLab.repaint();
        }
    }
}
