package com.codecool.testing;

public class NewPandemicException extends Exception {

    private static int COVID_NUMBER = 0;

    private final String pandemicName;

    public NewPandemicException(String pandemicName) {
        this.pandemicName = pandemicName;
    }

    public String getPandemicName() {
        return pandemicName;
    }

    public static int getCovidNumber(){
        COVID_NUMBER += 1;
        return COVID_NUMBER;
    }
}
