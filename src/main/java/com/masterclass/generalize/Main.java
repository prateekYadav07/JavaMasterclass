package com.masterclass.generalize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Animal wolf = new Dog("wolf", "big", 100);
        Animal pug = new Dog("pug", "small", 20);
        Animal goldfish = new Dog("goldfish", "small", 1);
        Animal barracuda = new Dog("barracuda", "big", 75);

        doAnimalStuff(wolf);
        List<Animal> animals = Arrays.asList(wolf, pug, goldfish, barracuda);
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }

}
