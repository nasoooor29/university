package Unit_4.C;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        printDescendingOrder(1, 2, 3);
    }

    public static void printDescendingOrder(int one, int two, int three) {
        int big1 = 0;
        int big2 = 0;
        int big3 = 0;

        Scanner scn = new Scanner(System.in);
        int v1 = one;
        int v2 = two;
        int v3 = three;

        if (v1 > v2 && v1 > v3) {
            big1 = v1;
        }

        else if (v1 > v2 && v1 < v3 || v1 < v2 && v1 > v3) {
            big2 = v1;
        }

        else if (v1 < v2 && v1 < v3) {
            big3 = v1;
        }

        if (v2 > v1 && v2 > v3) {
            big1 = v2;
        }

        else if (v2 > v1 && v2 < v3 || v2 < v1 && v2 > v3) {
            big2 = v2;
        }

        else if (v2 < v1 && v2 < v3) {
            big3 = v2;
        }

        if (v3 > v2 && v3 > v1) {
            big1 = v3;
        }

        else if (v3 > v2 && v3 < v1 || v3 < v2 && v3 > v1) {
            big2 = v3;
        }

        else if (v3 < v2 && v3 < v1) {
            big3 = v3;
        }
        System.out.println(String.format("Values in descending order are: %d %d %d.", big1, big2, big3));
        scn.close();
    }
}
