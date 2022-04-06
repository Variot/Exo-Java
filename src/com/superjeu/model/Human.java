package com.superjeu.model;

public class Human extends Humanoid{
    public int mana;

    public Human(String name, int x, int y, int health, double resistance, int mana) {
        super(name, x, y, health, resistance);
        this.mana = mana;
    }
}
