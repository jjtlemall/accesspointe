import java.util.Scanner;

public class ConvertHex {
//main method 
    public static void main(String[] args) {
//create scanner object to read data from the console, system.in
        Scanner input = new Scanner (System.in);
        //instructions for the user
        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();
        //only converting a single hexidecimal digit
//error 
        if (hexString.length() != 1) {
            System.out.println("You must enter exactly one character");
            System.exit(1);

        }
//converting to uppercase
        char ch = Character.toUpperCase(hexString.charAt(0));

        if (ch <= 'F' && ch >= 'A') {
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit " + ch + " is " + value);


        }
        else if (Character.isDigit(ch)) {
            System.out.println("The decimal value for hex digit " + ch + " is " + ch); 
            
        }
        else { 
            System.out.println(ch + " is an invalid input");
        }


    }

}