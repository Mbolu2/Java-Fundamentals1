package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 10;
        int anotherintvaue = myIntValue;

        System.out.println("myIntvalue =" + myIntValue);
        System.out.println("anotherIntValue =" + anotherintvaue);

        anotherintvaue++;

        System.out.println("myIntValue = "+ myIntValue);
        System.out.println("anotherIntValue = " + anotherintvaue);


        int[] myIntArray =new int[5];
        int [] anotherArray = myIntArray;

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray));

        anotherArray= new int[]{4,5,6,7,8};
        modifyArray(myIntArray);
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));

        justmodifyArray(myIntArray);
        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray));
    }
    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5};
    }
    private static void justmodifyArray(int[] array) {
        array [0] = 3;
    }
}
