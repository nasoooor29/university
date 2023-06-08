package Unit_4.B;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter password: ");
        String pass = scn.nextLine();

        final String right_pass = "C0RR3CT";
        final String right_phone = "1234";

        if (right_pass.equals(pass)) {
            System.out.println("Please enter the last 4 digits of your phone number: ");
            // i used "String" data type here because i won't use the phone number in any
            // mathematical calculation
            String phone = scn.nextLine();
            if (right_phone.equals(phone)) {
                System.out.println("You have gained access to the system!");
            } else {
                System.out.println("Your phone number is incorrect!");
            }

        } else {
            System.out.println("Your password is incorrect!");
        }

        scn.close();
    }
}
