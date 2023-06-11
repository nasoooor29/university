package Unit_8.C;

public class a {
    public static void main(String[] args) {
        int n = 5;
        int k = 0;

        for (int i = 1; i <= n; i++) {
            if (i <= (n / 2) + 1) {
                k = i;
            } else {
                k = n - i + 1;
            }
            for (int j = 1; j <= n; j++) {
                if (j >= (n / 2) + 2 - k && j <= (n / 2) + k) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
