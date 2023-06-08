package Unit_5.Lab5C;

import java.util.Scanner;

public class q5 {
    public static void menu() {
        Scanner scanner = new Scanner(System.in); // initilizing the scanner object
        final String PASSWORD = "pwd123"; // assigning the password to a constant
        String input; // declaring variables
        int input2;
        boolean equal;

        do { // ask the user to enter a password until it's valid password
            System.out.println("Enter your password");

            input = scanner.nextLine();
            equal = input.equals(PASSWORD);

            if (!equal) {
                System.out.println("Invalid password");
            }
        } while (!equal);

        do { // this loop will ask the user until he exit by entering the number 4
             // if the user entered the right password it will quit the loop and
            System.out.println("1. Choice 1\n2. Choice 2\n3. Choice 3\n4. Exit");
            input2 = scanner.nextInt(); // ask the user for a number between 1 to 4
            if (input2 >= 1 && input2 <= 3) {
                System.out.println("You have entered choice " + input2); // if the number between the range it will
                                                                         // output this
            } else if (input2 == 4) { // if the input is 4 the loop will break
                break;
            } else {
                System.out.println("You have entered an invalid choice"); // if the number is not between the range it
                                                                          // will output this
            }

        } while (equal);
        scanner.close(); // closing the scanner object
    }
}
