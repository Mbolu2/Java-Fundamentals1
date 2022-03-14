public class PositiveNegativeZero {

    // write a method called checkNumber with an int parameter number

    //The method should not return any value and it needs to print out

    //* "positive" if the parameter number is > 0
    //* "negative" if the parameter number is < o
    //* "Zero" if the parameter number is equal to 0

    //Note: The checkNumber method needs to be defined as publc
    // static like we have been doing so far in the course
    //Note: Do not add a main method to your solution code!
    public static void main(String[] args) {
    checkNumber(5);
    checkNumber(-10);
    checkNumber(0);
    }
        public static void checkNumber (int number){
        if(number>0){
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else if(number == 0){
            System.out.println("The number was Zero");
        }
    }
}
