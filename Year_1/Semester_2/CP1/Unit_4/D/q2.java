package Unit_4.D;

public class q2 {
    public static void main(String[] args) {
        int x = 1;
        System.out.println(isXOdd(x));
    }

    static boolean isXOdd(int x) {
        return x % 2 == 1 || x % 2 == -1;
    }
}
