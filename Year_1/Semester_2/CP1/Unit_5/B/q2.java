package Unit_5.B;

import java.util.Scanner;

public class q2 {
    public static void findLargest() {
        Scanner scn = new Scanner(System.in);
        int maxVal; // declaring the max value variable
        int nxtVal = 0; // declaring and assigning the next value variable
        maxVal = nxtVal; // making the max value equal to the next value

        do {
            System.out.println("Enter next integer:"); // ask the user question
            nxtVal = scn.nextInt(); // read the input from the user
            if (nxtVal >= maxVal) { // check if the inputted value is bigger than the max value
                maxVal = nxtVal; // if the value is bigger then it would be assigned to be the max value
            } else {
                continue;
            }
        } while (nxtVal >= 0); // the loop will contenue until the user input a below zero number

        System.out.println("The maximum value is: " + maxVal); // printing the max value if the loop is broke

        scn.close();
    }
}
