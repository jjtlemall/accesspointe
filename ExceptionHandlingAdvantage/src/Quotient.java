import java.util.Scanner;

public class Quotient {

    public static int quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");

        return (number1 / number2);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        try {
            int result = quotient (number1, number2);

            System.out.println(number1 + " / " + number2 + " is " +
                    result);
        }
        catch(Exception ex) {
            System.out.println("Exception: an integer cannot be divided by zero");
        }

        System.out.println("Execution continues...");

//        if (number2 !=0)


//        else

    }
    //Here, I will demonstrate how to modify code to use exceptions for error handling
    //and then illustrate the advantage of using exceptions for error handling
}
//now, if we were to take 10 and divide it by zero, we'd get a huge error that
// may be confusing to the user, so we need to create a meaningful error message
//for the user if they put in two integers that would create an error.

//Blocks of code that may cause an exception can be placed in a try block
//exceptions that are thrown are handled by 'catch' blocks
//exceptions are particularly useful in libraries; Library can detect the error and let the caller
// decide what to do
//Separates the detection of errors from error handling