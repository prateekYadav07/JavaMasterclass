package com.masterclass.generalize;

public abstract class Animal {
    public String type;
    public String size;
    public double weight;

    public Animal(String type, String size, double weight){
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

}
