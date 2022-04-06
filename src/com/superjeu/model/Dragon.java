package com.superjeu.model;

public class Dragon extends Animal{
    private int power;
    private int range;

    public Dragon(String name, int x, int y, int health, double resistance, int power, int range) {
        super(name, x, y, health, resistance);
        this.power = power;
        this.range = range;
    }
}
