package Unit_3.A;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please enter your name:");
        String name = scn.nextLine();
        System.out.println();

        System.out.print("Please enter your age:");
        int age = scn.nextInt();
        System.out.println();

        System.out.print("Please enter your country of birth:");
        scn.nextLine();
        String birth = scn.nextLine();
        System.out.println();

        String msg = String.format("Hi %s, you're %s and born in %s", name, age, birth);
        System.out.print(msg);

        scn.close();
    }
}
