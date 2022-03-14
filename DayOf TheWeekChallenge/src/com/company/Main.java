package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printDoyOfTheWeek(-1);
        printDoyOfTheWeek(0);
        printDoyOfTheWeek(1);
        printDoyOfTheWeek(2);
        printDoyOfTheWeek(3);
        printDoyOfTheWeek(4);
        printDoyOfTheWeek(5);
        printDoyOfTheWeek(6);
    }
    private static void printDoyOfTheWeek(int day){

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
