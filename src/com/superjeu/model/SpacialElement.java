package com.superjeu.model;

public abstract class SpacialElement {
    private String name;
    protected int x;
    protected int y;

    public SpacialElement(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
}
