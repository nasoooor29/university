package Unit_6.B;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;
        int itemsEnterd = 0;
        boolean breakFirst = false;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number");
            int inp = scn.nextInt();

            if (inp == -99) {
                if (i == 0) {
                    breakFirst = true;
                }
                break;
            }
            arr[i] = inp;
            sum += arr[i];
            itemsEnterd += 1;
        }
        if (breakFirst) {
            System.out.println("Array is empty");
        } else {
            System.out.println("Array content:");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    System.out.println(arr[i]);
                }
            }
            double avg = sum / itemsEnterd;
            System.out.println(
                    String.format("Enter Array average: %s", avg));
        }
        scn.close();
    }
}
