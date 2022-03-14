import java.util.Scanner;

public class product {
    public static void main(String[] args) {
//        Write declarations, statements or comments that accomplish each of the following tasks:
//        a) State that a program will calculate the product of three integers.
//                b) Create a Scanner called input that reads values from the standard input.
//        c) Declare the variables x, y, z and result to be of type int.
//                d) Prompt the user to enter the first integer.
//        e) Read the first integer from the user and store it in the variable x.
//        f) Prompt the user to enter the second integer.
//        g) Read the second integer from the user and store it in the variable y.
//        h) Prompt the user to enter the third integer.
//        i) Read the third integer from the user and store it in the variable z.
//        j) Compute the product of the three integers contained in variables x, y and z, and assign
//        the result to the variable result.
//        k) Use System.out.printf to display the message "Product is" followed by the value of
//        the variable result.

//        System.out.println(number); // output = 25
//        Scanner scanner = new Scanner(System.in);

        int result,x=1, y=1, z=1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The First Integer:");
          x=Integer.parseInt(scanner.next());

        System.out.println("Enter The Second Integer:");
        y=Integer.parseInt(scanner.next());

        System.out.println("Enter The Third Integer:");
        z=Integer.parseInt(scanner.next());

        result = x * y * z;
        System.out.println( "The result obtained is " + result);
    }
}
