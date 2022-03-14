package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double myFirstVariable = 20.00d;
        double mySecondVariable = 80.00d;
        double sumOfVariable = (myFirstVariable +
                mySecondVariable) * 100.00d;
        System.out.println("SumOfVariable =" + sumOfVariable);
        double theRemainder = sumOfVariable%40.00d;
        System.out.println("theRemainder =" + theRemainder);

        boolean isNoRemainder = (theRemainder==0)?true:false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");}
        }
}
