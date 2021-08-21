package com.company;

public class Fish extends Animal {
    private int eyes;
    private int gills;

    public Fish(String name, int size, int weight, int eyes, int gills) {
        super(name, size, weight, 10);
        this.eyes = eyes;
        this.gills = gills;
    }
}
