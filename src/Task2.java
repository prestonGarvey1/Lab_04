import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        //New scanner object
        Scanner scan = new Scanner(System.in);

        //Add variables
        double taxRate = 0.05;
        double tax;
        double price;
        double finalPrice;

        System.out.println("Please enter the price of your purchase");
        price = scan.nextDouble();

        tax = price * taxRate;
        finalPrice = tax + price;

        System.out.println("Your final price with an added sales tax of 5% is "+finalPrice+"$ .");


    }
}
