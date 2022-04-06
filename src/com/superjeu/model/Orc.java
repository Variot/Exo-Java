package com.superjeu.model;

public class Orc extends Humanoid{
    public int rage;

    public Orc(String name, int x, int y, int health, double resistance, int rage) {
        super(name, x, y, health, resistance);
        this.rage = rage;
    }
}
