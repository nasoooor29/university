package Unit_8.C;

public class q2 {
    public static void main(String[] args) {

        System.out.println(fib(4));
        // 3
        System.out.println(fib(5));
        // 5
    }

    private static int fib(int n) {
        int[] aa = {
                0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377,
                610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368,
                75025, 121393, 196418, 317811
        };
        return aa[n];
    }

    private static int fibonacci(int n) {
        if (n == 0 || n == 1)
            return 0;
        else if (n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
