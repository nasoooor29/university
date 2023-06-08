package Unit_4.C;

public class q4 {
    public static void main(String[] args) {
        printReversedOrder(381);
        printReversedOrder(123);
        printReversedOrder(654);
    }

    public static void printReversedOrder(int n) {

        if (n >= 100 && n <= 999) {

            System.out.println(String.format("%d reversed is %d%d%d.", n, (n / 1) % 10, (n / 10) % 10, (n / 100) % 10));

        } else {
            System.out.println("incorrect input.");
        }

    }
}
