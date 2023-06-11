package Unit_6.B;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        String winners[] = { "Manama", "Sitra", "Muharraq", "AlAhli", "Riffa" };
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter a team name");
        boolean inside = false;
        String input = scn.nextLine();
        for (int i = 0; i < winners.length; i++) {
            if (winners[i].equals(input)) {
                inside = true;
                System.out.println(
                        String.format("%s has won the league in the last 5 years", winners[i]));
            }
        }

        if (!inside) {
            System.out.println(
                    String.format("%s has NOT won the league in the last 5 years", input));
        }
        scn.close();
    }
}
