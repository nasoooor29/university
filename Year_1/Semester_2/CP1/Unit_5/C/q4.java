package Unit_5.C;

import java.util.Scanner;

public class q4 {
    public static void menu() {
        Scanner scanner = new Scanner(System.in); // initilizing the scanner object
        final String PASSWORD = "pwd123"; // assigning the password to a constant
        String input; // declaring variables
        boolean equal;

        do { // ask the user to enter a password until it's valid password
            System.out.println("Enter your password");

            input = scanner.nextLine();
            equal = input.equals(PASSWORD);

            if (!equal) {
                System.out.println("Invalid password");
            }
        } while (!equal);

        // if the user entered the right password it will quit the loop and
        System.out.println("1. Choice 1\n2. Choice 2\n3. Choice 3\n4. Choice 4");
        int input2 = scanner.nextInt(); // ask the user for a number between 1 to 4
        if (input2 >= 1 && input2 <= 4) {
            System.out.println("You have entered choice " + input2); // if the number between the range it will output
                                                                     // this
        } else {
            System.out.println("You have entered an invalid choice"); // if the number is not between the range it will
                                                                      // output this
        }
        scanner.close(); // closing the scanner object
    }
}
