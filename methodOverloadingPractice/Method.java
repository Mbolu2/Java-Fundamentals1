public class Method {

    public static double calcFeetAndInchesToCentimeters(double Feet, double Inches){

        if((Feet<0) || ((Inches) && (Inches > 12)){
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet, " + " inches = " + centimeters + "cm");
        return centimeters;
    }
       public static int calcFeetAndInchesToCentimeters(Inches){


       }

}
