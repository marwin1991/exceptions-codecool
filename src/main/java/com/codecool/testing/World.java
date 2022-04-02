package com.codecool.testing;

import java.util.Random;

public class World {

    public static void main(String[] args){

        World superWorld = new World();

        while (true) {
            try {
                superWorld.run();
            } catch (NewPandemicException ala) { // two catches in one try, collapse catches
                System.out.println("Oh now, again: " + ala.getClass().getSimpleName() + " name of disease: " + ala.getPandemicName());
                //e.printStackTrace();
                //e.printStackTrace(System.out);
            }
        }

    }

    private void run() throws NewPandemicException {
        while (true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException ignore) {}

            int random = new Random().nextInt(1000);
            System.out.println("Number: " + random);

            if(random % 100 == 0){
                throw new NewPandemicException("Covid+"+ NewPandemicException.getCovidNumber());
            }

            if(random % 666 == 0){
                throw new AsteroidException();
            }
        }
    }
}
