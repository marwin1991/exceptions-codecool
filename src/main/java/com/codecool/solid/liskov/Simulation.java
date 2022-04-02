package com.codecool.solid.liskov;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private List<Bird> birds = new ArrayList<>();

    public void migrate(Avian avian){
        avian.fly();
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation();
        simulation.birds.add(new Ostrich());
        simulation.birds.add(new Sparrow());

        simulation.birds.forEach(bird ->{
            if(bird instanceof Avian){
               simulation.migrate((Avian) bird);
            }
        });


    }
}
