import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Create scanner object
        Scanner scan = new Scanner(System.in);

        //State values
        int degreesF;
        int degreesC;

        System.out.println("Please enter your temperature in Fahrenheit:");
        degreesF = scan.nextInt();
        //Convert to Celsius
        degreesC = (degreesF - 32) * 5/9;
        //Print result
        System.out.println("Your temperature converted to Fahrenheit is " +degreesC+ "° Celsius.");


    }
}
