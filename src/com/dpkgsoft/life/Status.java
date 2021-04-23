package com.dpkgsoft.life;

public enum Status {
    NONE,   // I
    BORN,   // II
    LIVE,   // I
    DIED;   // II

    public Status step1(int around) {
        switch (this) {
            case NONE: return (around == 3) ? BORN : NONE;
            case LIVE: return (around < 2 || around > 3) ? DIED : LIVE;
            default: return this;
        }
    }

    public Status step2() {
        switch (this) {
            case BORN: return LIVE;
            case DIED: return NONE;
            default: return this;
        }
    }

    public boolean isNonEmptyCell() {
        return this == LIVE || this == DIED;
    }
}
