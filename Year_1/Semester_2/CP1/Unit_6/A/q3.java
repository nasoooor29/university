package Unit_6.A;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        final int LENGTH_OF_THE_ARRAY = 10;

        Scanner scn = new Scanner(System.in);

        String[] arr = new String[LENGTH_OF_THE_ARRAY];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter a name");
            arr[i] = scn.nextLine();
        }
        System.out.println("The array contains:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("The array contains:");
        for (int i = 0; i < arr.length; i++) {
            if (i == 4) {
                System.out.println("aaaaa");
            } else if (i == 6) {
                System.out.println("bbbbb");
            } else {
                System.out.println(arr[i]);
            }
        }
        scn.close();
    }

}
