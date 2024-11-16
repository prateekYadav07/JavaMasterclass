package com.masterclass.generalize;

import java.util.Objects;

public class Dog extends Animal{

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        String movement = Objects.equals(speed, "slow") ? "Walking" : "Running";
        System.out.println(type + " " +movement);
    }

    @Override
    public void makeNoise() {
        String noise = Objects.equals(type, "wolf") ? "Howling!" : "Woof!";
        System.out.println(noise);
    }
}
