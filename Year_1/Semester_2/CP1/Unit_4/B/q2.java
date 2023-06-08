package Unit_4.B;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        System.out.println("Please enter your exam mark");
        Scanner scn = new Scanner(System.in);

        int grade = scn.nextInt();
        // int grade = 10;

        if (grade >= 85 && grade <= 100) {
            System.out.println("Your grade is A");
        }

        else if (grade >= 70 && grade <= 84) {
            System.out.println("Your grade is B");
        }

        else if (grade >= 60 && grade <= 69) {
            System.out.println("Your grade is C");
        }

        else if (grade >= 0 && grade <= 59) {
            System.out.println("Your grade is D");
        }

        scn.close();

    }
}
