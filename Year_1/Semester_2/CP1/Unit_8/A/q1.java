package Unit_8.A;

import java.util.Scanner;

public class q1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    // public static void main()
    {
        System.out.println("Welcome to Unit 8 Lab");
        System.out.println("You will have 4 opportunities to choose what calculations to do");
        processChoice("Opportunity #1");
        processChoice("Second Opportunity");
        processChoice("Opportunity #3");
        processChoice("This is your last chance");
        System.out.println("Thank you for using this program. Goodbye!");

    }

    public static void processChoice(String msg) {
        int choice;
        System.out.println(msg);
        System.out.println("1. Do an addition");
        System.out.println("2. Do a subtraction");
        System.out.println("3. Do a multiplication");
        System.out.println("4. Do an integer division");

        System.out.println("Your Choice: ");
        choice = scan.nextInt();

        if (choice < 1 || choice > 4) {
            System.out.println("Invalid Choice. You wasted an opportunity!");
        } else if (choice == 1) {
            doAddition();
        } else if (choice == 2) {
            doSubtraction();
        } else if (choice == 3) {
            doMultiplication();
        } else if (choice == 4) {
            doDivision();
        }

    }

    public static void doAddition() {
        int val1;
        int val2;
        System.out.println("Enter first number: ");
        val1 = scan.nextInt();
        System.out.println("Enter second number: ");
        val2 = scan.nextInt();

        int result = val1 + val2;
        System.out.println("The sum of " + val1 + " and " + val2 + " is " + result);
    }

    public static void doSubtraction() {
        int val1;
        int val2;
        System.out.println("Enter first number: ");
        val1 = scan.nextInt();
        System.out.println("Enter second number: ");
        val2 = scan.nextInt();

        int result = val1 - val2;
        System.out.println("The result of subtracting " + val2 + " from " + val1 + " is " + result);
    }

    public static void doMultiplication() {
        int val1;
        int val2;
        System.out.println("Enter first number: ");
        val1 = scan.nextInt();
        System.out.println("Enter second number: ");
        val2 = scan.nextInt();

        int result = val1 * val2;
        System.out.println("Multiplying " + val1 + " and " + val2 + " gives " + result);
    }

    public static void doDivision() {
        int val1;
        int val2;
        System.out.println("Enter first number: ");
        val1 = scan.nextInt();
        System.out.println("Enter second number: ");
        val2 = scan.nextInt();

        int result = val1 / val2;
        System.out.println("The sum of integer division of " + val1 + " by " + val2 + " is " + result);
    }
}