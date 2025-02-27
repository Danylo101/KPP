package com.lab.lab11;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ActionHandler extends MouseAdapter {
    private final WinLab11 winLab;
    public ActionHandler(WinLab11 winLab) {
        this.winLab = winLab;
    }
    public void mousePressed(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1 && e.isControlDown() && e.isShiftDown()) {
            winLab.setLocation(winLab.getLocation().x - 5, winLab.getLocation().y);
        }
    }
}
