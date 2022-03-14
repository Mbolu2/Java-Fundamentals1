package com.company;

public class Main {

    public static void main(String[] args) {
	// Average an array of values.

       int twoD[][] = new int [4][5];
       int i, j, k =0;

       for(i=0; i<4; i++)
           for(j=0; j<5; j++) {
               twoD [i][j] = k;
               k++;
           }

       for(i = 0; i< 4; i++){
           for(j = 0; j<5; j++)
               System.out.print(twoD[i][j] + " ");
           System.out.println();
       }
       boolean isAlien = false;
       if (isAlien == false) {
           System.out.println("It is not an alien");
           System.out.println("And I am scared of aliens");
       }

       int topScore = 100;
       if (topScore == 100) {
           System.out.println("You got the high score!");
       }
       int secondTopScore = 60;
       if ((topScore>secondTopScore) && (topScore<100)){
           System.out.println("Greater than second top score and less than 100");
       }
       if ((topScore>90) || (secondTopScore<= 90)) {
           System.out.println("Either or both of the conditions are true");
       }

    }
}
