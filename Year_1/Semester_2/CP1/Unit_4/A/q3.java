package Unit_4.A;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter password: ");
        String pass = scn.nextLine();

        if (pass.equals("C0RR3CT")) {
            System.out.println("You have gained access to the system!");
        } else {
            System.out.println("Your password is incorrect!");
        }

        scn.close();

    }
}
