package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByteVariable = 12;
        short myShortVariable = 20;
        int myIntVariable = 28;
        long myLongVariable = 50000L + 10L *(
                myByteVariable+myShortVariable+myIntVariable);
        System.out.println("" + myLongVariable);
    }
}
