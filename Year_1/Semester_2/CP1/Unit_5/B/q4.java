package Unit_5.B;

import java.util.Scanner;

public class q4 {
    public static void sumOfOdd() {
        Scanner scn = new Scanner(System.in); // creating scanner object
        int sum = 0; // assigning sum to 0 as starting value
        int nxt; // declaring next value varaible

        do {
            System.out.println("Enter a number (0 to quit):"); // user prompt
            nxt = scn.nextInt(); // read the value from the user
            if (nxt != 0 && (nxt % 2 == 1 || nxt % 2 == -1)) { // if the next value is not zero and the reminder after
                                                               // deviding by 2 is 1 or -1 the if statment would work
                sum += nxt; // we will sum the next value to the sum variable if the condition worked
            }
        } while (nxt != 0); // if the next value is 0 the loop will break
        scn.close(); // closing the scanner object to ensure the memory safty
        System.out.println("The sum of odd numbers is " + sum); // printing the output
    }
}
