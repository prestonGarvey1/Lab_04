import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        //Create scanner object
        Scanner scan = new Scanner(System.in);

        //Add values
        double totalServiceCost;
        double springCost;
        double fallCost;
        double summerCost;
        double winterCost;

        //Prompt user for costs
        System.out.println("Please enter your costs in this order: Spring, Summer, Fall, Winter.");
        springCost = scan.nextDouble();
        summerCost = scan.nextDouble();
        fallCost = scan.nextDouble();
        winterCost = scan.nextDouble();

        //Add costs together and print total cost
        totalServiceCost = springCost + fallCost + summerCost + winterCost;

        System.out.println("Your total service cost is $"+totalServiceCost+" for all four seasons.");


    }
}
