import java.util.Scanner;

public class HelloWorld {
        public static void main(String args [])
        {

            System.out.println("Please Enter Your Weight:");
            Scanner scanner = new Scanner (System.in);
            float weight = scanner.nextFloat();

            System.out.println("Please Enter Your Height");
            scanner = new Scanner (System.in);
            float height = scanner.nextFloat();

            float BMI = (weight/height*height);
            System.out.println("BMI =" + BMI);
            }
}
