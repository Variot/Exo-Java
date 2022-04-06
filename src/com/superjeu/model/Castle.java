package com.superjeu.model;

public class Castle extends House{
    public int defense;

    public Castle(String name, int x, int y, int price, Ematerial material, int defense) {
        super(name, x, y, price, material);
        this.defense = defense;
    }
}
