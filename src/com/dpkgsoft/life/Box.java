package com.dpkgsoft.life;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Box extends JPanel {

    Cell cell;

    public Box (int x, int y) {
        super();
        setBounds(x * Config.SIZE, y * Config.SIZE, Config.SIZE, Config.SIZE);
        setBackground(Config.getColor(Status.NONE));
        this.cell = new Cell();
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                cell.turn(e.getButton() == MouseEvent.BUTTON1);
            }
        });
    }

    public void setColor() {
        setBackground(Config.getColor(cell.status));
    }

    public void step1() {
        cell.step1();
        setColor();
    }

    public void step2() {
        cell.step2();
        setColor();
    }
}
