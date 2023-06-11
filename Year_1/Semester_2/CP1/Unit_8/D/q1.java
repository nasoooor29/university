package Unit_8.D;

import java.io.File;

public class q1 {
    public static void printLine(int length, int num) {
        for (int i = 0; i < length; i++) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void spacer(int spaceNum) {
        for (int i = 0; i < spaceNum; i++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {

        int n = 5;
        int maxSpace = n - 1;
        int currentSpace = maxSpace;
        int previusSpace;
        for (int i = 1; i <= n; i++) {
            // spacer(currentSpace);
            // printLine(1, i);
            currentSpace -= 2;
            if (currentSpace == 0) {

            }
        }
        spacer(4);
        printLine(1, 1);
        spacer(2);
        printLine(3, 2);
        spacer(0);
        printLine(5, 3);
        spacer(2);
        printLine(3, 4);
        spacer(4);
        printLine(1, 5);

    }
}
