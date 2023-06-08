package Unit_3.B;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scn.nextLine();
        int roll = 5;
        // int roll = (int)(Math.random()*6+1);

        System.out.println("Rolling the dice...");
        System.out.printf("%s, you rolled %d!", name, roll);

        scn.close();
    }
}
