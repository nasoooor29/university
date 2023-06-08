package Unit_2.A;

import java.util.Scanner;

public class q2 {
    public static void main(String args[]) {
        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);
        int number1; // 2 - declaring a variable number1 of type integer
        int number2; // 3 - declaring a variable number2 of type integer
        int sub; // 4 - declaring a variable Difference of type integer
        System.out.println("Enter first integer: "); // prompt user what to do
        number1 = input.nextInt(); // read first number from user
        System.out.println("Enter second integer: "); // prompt user what to do
        number2 = input.nextInt(); // read second number from user and save in variable
        sub = number1 - number2; // 5 - Difference numbers and save in variable
        System.out.println("Difference is " + sub); // 6 - display Difference
        input.close();
    } // end method main
}
