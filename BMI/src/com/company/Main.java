package com.company;

public class Main {

    public static void main(String[] args) {

//        Multiply your monthly electric bill by 105
//        Multiply your monthly gas bill by 105
//        Multiply your monthly oil bill by 113
//        Multiply your total yearly mileage on your car by .79
//        Multiply the number of flights you’ve taken in the past year (4 hours or less) by 1,100
//        Multiply the number of flights you’ve taken in the past year (4 hours or more) by 4,400
//        Add 184 if you do NOT recycle newspaper
//        Add 166 if you do NOT recycle aluminum and tin
//        Add 1-8 together for your total carbon footprint

        int electricBill = 6000*105;
        int gasBill = 5000*105;
        int oilBill = 3000*113;
        double yearlymilage =10000*0.79;
        int flights = (0*1100)+(0*4400);
        int recycle = 184;
        int aluminumAndTin = 166;

        System.out.println("Your Carbon Footprint is: " + electricBill+ gasBill+
                oilBill + yearlymilage
                + flights + recycle+ aluminumAndTin);

        //calculate BMI
        // Bodyweight in kilograms divided by height
        // in meters squared
        int bodyWeight = 50;
        double height = 1.6;

        int BMI = (int) (bodyWeight/ (int) height*height);

        System.out.println("Your Body Mass is " + BMI + "Kg/m^2");

//        Write statements to accomplish each of the following tasks:
//        a) Declare variables c, thisIsAVariable, q76354 and number to be of type int.
//                b) Prompt the user to enter an integer.
//                c) Input an integer and assign the result to int variable value. Assume Scanner variable
//        input can be used to read a value from the keyboard.
//                d) Print "This is a Java program" on one line in the command window. Use method
//        System.out.println.
//                e) Print "This is a Java program" on two lines in the command window. The first line
//        should end with Java. Use method System.out.printf and two %s format specifiers.
//        f) If the variable number is not equal to 7, display "The variable number is not equal to 7".

        int c;
        int thisIsAVariable;
        int q76354;
        int number;
        System.out.println("Enter an Integer");


        System.out.println("This is a Java program");
        System.out.printf("%s%n%s%n", "This is a Java", "program");

        int variableNumber = 8;
        if(variableNumber != 7){
        System.out.println("Variable number " +
                "is not equal to 7");}



    }
}
