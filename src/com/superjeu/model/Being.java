package com.superjeu.model;

public abstract class Being extends SpacialElement implements Comparable<Being>{
    private int maxHealth = 100;
    protected int health;
    protected double resistance;

    public Being(String name, int x, int y, int health, double resistance) {
        super(name, x, y);
        this.resistance = resistance;
    }

    public void receiveDamage(int amount){
        this.health -= amount;
    }

    @Override
    public int compareTo(Being o) {
        if (this.health < o.health)
            return -1;
        else if(this.health > o.health)
            return 1;
        else
            return 0;
    }
}
