import java.util.Scanner;

public class getLoanClass {
    /** Main Method*/
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        //Enter Yearly interest rate
        System.out.print(" Enter yearly interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        //Enter number of years
        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        //Enter Loan amount
        System.out.print("Enter loan amount, for example 120000.95: ");
        double loanAmount = input.nextDouble();

        //Create loan object
        Loan loan=
                new Loan(annualInterestRate, numberOfYears, loanAmount);

        //Display loan date, monthly payment. and total payment
        System.out.printf("The loan was created on %s\n" + "The monthly " +
                "payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(),
                loan.getMonthlyPayment(), loan.getTotalPayment());
    }
}
//this code creates a class for calculating loan repayments, uses UML to represent the design and it
//shows member variables, methods, and visibility of members