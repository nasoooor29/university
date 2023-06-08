package Unit_3.A;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your fullname:");
        String name = scn.nextLine();
        System.out.println("");
        System.out.printf(
                "Your name in uppercase is: %s\nYour name in lowercase is: %s\nThe length of your name is: %d",
                name.toUpperCase(), name.toLowerCase(), name.length());

        scn.close();
    }
}
