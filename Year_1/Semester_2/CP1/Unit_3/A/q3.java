package Unit_3.A;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your fullname: ");
        System.out.println();
        String name = scn.nextLine();
        String[] splitted = name.split(" ");

        System.out.printf("Your initials are: %c.%c.\n",
                splitted[0].toUpperCase().charAt(0),
                splitted[1].toUpperCase().charAt(0));
        System.out.printf("Your family name is: %s", splitted[1]);

        System.out.println();
        scn.close();
    }
}
