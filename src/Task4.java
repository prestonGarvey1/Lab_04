public class Task4 {
    public static void main(String[] args) {
        //State values
        double balance = 5000.00;
        double interestRate = 0.17;
        double monthlyInterestRate = interestRate / 12;

        //Calculate balance after one month
        double monthOne = balance + (balance * monthlyInterestRate);
        System.out.println("Your balance with the added interest rate for one month is: "+monthOne);

        //Calculate balance after two months
        double monthTwo = monthOne + (monthOne * monthlyInterestRate);
        System.out.println("Your balance with the added interest rate for two months is: "+monthTwo);





    }
}
