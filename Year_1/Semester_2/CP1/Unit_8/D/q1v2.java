package Unit_8.D;

public class q1v2 {
    public static void main(String[] args) {
        diamondPrint(4);
    }

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

    public static void diamondPrint(int n) {

        n = 5;
        // if (n % 2 != 0) {
        // System.out.println("size must be an odd number");
        // } else {

        // }
        int newNum = n / 2;

        // for (int i = 1; i <= n; i++) {
        // spacer(newNum);
        // printLine(i, i);
        // newNum -= 1;
        // }
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
