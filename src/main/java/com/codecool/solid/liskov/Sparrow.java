package com.codecool.solid.liskov;

public class Sparrow extends Bird implements Avian, Comparable<Sparrow> {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }

    @Override
    public int compareTo(Sparrow o) {
        return 0;
    }
}
