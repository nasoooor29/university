package Unit_5.Lab5C;

import java.util.Scanner;

public class q3 {
    static Scanner input = new Scanner(System.in);

    static int formGroups() {
        int nStu; // declare nstu variable

        System.out.println("How many students are in the group?");
        nStu = input.nextInt(); // take the number of students from the user

        do { // this loop will execute until the user enter a positive number of students
            if (nStu <= 0) {
                System.out.println("Error: total number of students must be positive");
                System.out.println("How many students are in the group?");
                nStu = input.nextInt();
            } else {
                break;
            }
        } while (nStu <= 0);
        return nStu; // return the number of students
    }

    public static int enterTeamSize() {
        int value2; // declare val
        boolean exit = false;

        do {
            System.out.println("How many students should be in each team?"); // prompt user
            value2 = input.nextInt(); // get input
            if (value2 < 2 || value2 > 5)
                System.out.println("Error: team size must be between 2 and 5");
            else
                exit = true;

        } while (!exit); // loop test

        return value2; // return value2
    }

    static void calculateNbTeams(int total, int size) {

        int rem = total % size; // use the modulou to take the reminder students
        int teams = total / size; // divide the total number of students by the size of the teams
        System.out.println( // print the output to the user
                String.format("There will be %d teams", teams));
        System.out.println(
                String.format("There will be %d students who have no team", rem));

    }
}
