package com.company;

public class Main {

    public static void main(String[] args) {

        int kilogramValue = 1;
        float poundValue = 0.45359237f;

        float convertedValue = (float) ((25*poundValue) * (kilogramValue)
                        / (poundValue));
        System.out.println("" + convertedValue);

    }
}
