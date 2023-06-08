package Unit_2.A;
// 1- read two numbers from the user using the Scanner module and add the inputs then print it in the terminal.

import java.util.Scanner; // program uses class Scanner

public class q1 {
    // main method begins execution of Java application
    public static void main(String args[]) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        int number1; // 2 - declare the first variable to be an int
        int number2; // 3 - declare the second variable to be an int
        int sum; // 4 - declare the third variable to be an int and it's going to be the sum
                 // between the first and second variable
        System.out.println("Enter first integer: "); // prompt user what to do
        number1 = input.nextInt(); // read first number from user
        System.out.println("Enter second integer: "); // prompt user what to do
        number2 = input.nextInt(); // read second number from user and save in variable
        sum = number1 + number2; // 5 - sum number1 and number2 and assign it to the third variable (sum)
        System.out.println("Sum is " + sum); // 6 - concatenate the string "Sum is " and the result of the previous
                                             // statment (sum)
        input.close();
    } // end method main
} // end class Addition
