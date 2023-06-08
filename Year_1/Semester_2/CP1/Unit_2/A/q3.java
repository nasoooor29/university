package Unit_2.A;

// 1- Addition program that displays the sum of two numbers.
import java.util.Scanner; // program uses class Scanner

public class q3 {
    // main method begins execution of Java application
    public static void main(String args[]) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        int number1; // 2 - declaring a variable number1 of type integer
        int number2; // 3 - declaring a variable number2 of type integer
        int number3; // 3 - declaring a variable number3 of type integer

        int sum; // 4 - declaring a variable sum of type integer to sum all the integers above
        System.out.println("Enter first integer: "); // prompt user what to do
        number1 = input.nextInt(); // read first number from user
        System.out.println("Enter second integer: "); // prompt user what to do
        number2 = input.nextInt(); // read second number from user and save in variable
        System.out.println("Enter third integer: "); // prompt user what to do
        number3 = input.nextInt(); // read second number from user and save in variable

        sum = number1 + number2 + number3; // 5 - add numbers and save in variable of sum
        System.out.println("Sum is " + sum); // 6 - display sum of the numbers
        input.close();
    } // end method main
} // end class Addition
