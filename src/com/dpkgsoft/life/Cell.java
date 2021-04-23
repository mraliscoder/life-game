package com.dpkgsoft.life;

import java.util.ArrayList;

public class Cell {
    ArrayList<Cell> near;
    Status status;

    public Cell() {
        status = Status.NONE;
        near = new ArrayList<>();
    }

    void addNear(Cell cell) {
        near.add(cell);
    }

    void step1() {
        int around = countNearCells();
        status = status.step1(around);
    }

    void step2() {
        status = status.step2();
    }

    int countNearCells() {
        int count = 0;
        for (Cell cell : near) {
            if (cell.status.isNonEmptyCell())
                count++;
        }
        return count;
    }

    void turn(boolean all) {
        if (all) {
            for (Cell cell : near) {
                cell.status = cell.status.isNonEmptyCell() ? Status.NONE : Status.LIVE;
            }
        } else {
            status = status.isNonEmptyCell() ? Status.NONE : Status.LIVE;
        }
    }
}
