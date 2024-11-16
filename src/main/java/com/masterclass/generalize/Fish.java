package com.masterclass.generalize;

import java.util.Objects;

public class Fish extends Animal{

    public Fish(String type, String size, double weight) {
        super(type, size, weight);
    }

    @Override
    public void move(String speed) {
        String movement = Objects.equals(speed, "slow") ? "lazily swimming" : "darting franatically";
        System.out.println(type + " " +movement);
    }

    @Override
    public void makeNoise() {
        String noise = Objects.equals(type, "goldfish") ? "Swish!" : "Splash!";
        System.out.println(noise);
    }
}
