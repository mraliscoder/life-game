package com.dpkgsoft.life;

import java.awt.*;

public class Config {
    public static final int SIZE = 15;
    public static final int WIDTH = 60;
    public static final int HEIGHT = 40;
    public static final int SLEEP_MS = 200;

    public static Color getColor(Status status) {
        switch (status) {
            case NONE: return Color.BLACK;
            case BORN: return Color.GREEN;
            case LIVE: return Color.BLUE;
            case DIED: return Color.GRAY;
            default: return Color.RED;
        }
    }
}
