package com.superjeu.model;

public class House extends SpacialElement{
    private int price;
    private Ematerial material;

    public House(String name, int x, int y, int price, Ematerial material) {
        super(name, x, y);
        this.price = price;
        this.material = material;
    }
}
