package Unit_4.A;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scn.nextInt();
        System.out.println("You entered: " + age);

        if (age < 21) {
            System.out.println("It's great to be young!");
        } else if (age >= 21) {
            System.out.println("Age is a state of mind!");
        } else {
            System.out.println("wha??");
        }

        scn.close();

    }
}
