package com.superjeu.model;

public class Eagle extends Animal{
    public int vision;

    public Eagle(String name, int x, int y, int health, double resistance, int vision) {
        super(name, x, y, health, resistance);
        this.vision = vision;
    }

}
