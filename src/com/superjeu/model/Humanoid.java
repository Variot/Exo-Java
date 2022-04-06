package com.superjeu.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Humanoid extends Being{
    private List<Animal> animals = new ArrayList<>();
    private List<House> houses = new ArrayList<>();

    public Humanoid(String name, int x, int y, int health, double resistance) {
        super(name, x, y, health, resistance);
    }
}
