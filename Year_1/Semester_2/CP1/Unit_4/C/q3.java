package Unit_4.C;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        printReversedOrder();
    }

    public static void printReversedOrder() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a 3-digit number:");
        String num = scn.nextLine();
        scn.close();

        if (num.length() == 3) {

            System.out
                    .println(String.format("%s reversed is %c%c%c.", num, num.charAt(2), num.charAt(1), num.charAt(0)));

        } else {
            System.out.println("incorrect input.");
        }
    }
}
