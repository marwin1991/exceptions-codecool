package com.codecool.exceptionscodecool.model;

public abstract class PowerComponent {
    private final int power; //positive is power supply negative power consumption

    public PowerComponent(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }
}
