package Unit_8.A;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        System.out.println(
                String.format("1: Add\n2: Subtract\n3: Multiply\n4: Divide\n5: Exit"));

        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();

        if (inp >= 1 && inp <= 4) {
            int v1 = scanner.nextInt();
            int v2 = scanner.nextInt();

            if (inp == 1) {
                System.out.println("the result is: " + add(v1, v2));
            } else if (inp == 2) {
                System.out.println("the result is: " + subtract(v1, v2));
            } else if (inp == 3) {
                System.out.println("the result is: " + multiply(v1, v2));
            } else if (inp == 4) {
                System.out.println("the result is: " + divide(v1, v2));
            }

        } else {
            if (inp == 5) {
                System.exit(0);
            } else {
                System.out.println("??????????????");
            }
        }
        scanner.close();
    }

    public static int add(int v1, int v2) {
        return v1 + v2;

    }

    public static int subtract(int v1, int v2) {
        return v1 - v2;

    }

    public static double divide(int v1, int v2) {
        return v1 / v2;

    }

    public static int multiply(int v1, int v2) {
        return v1 / v2;

    }
}
