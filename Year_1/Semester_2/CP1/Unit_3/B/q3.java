package Unit_3.B;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the ISBN in the following format x-xxx-xxxxx-x: ");
        String bin = scn.nextLine();
        // String bin = "1-234-56789-0";
        String[] splt = bin.split("-");
        System.out.printf("Language is: %s\n", splt[0]);
        System.out.printf("Publisher is: %s\n", splt[1]);
        System.out.printf("Book is: %s\n", splt[2]);
        System.out.printf("Check is: %s\n", splt[3]);

        scn.close();

        // Please enter the ISBN in the following format x-xxx-xxxxx-x:
        // Language is: 1
        // Publisher is: 234
        // Book is: 56789
        // Check is: 0
    }
}
