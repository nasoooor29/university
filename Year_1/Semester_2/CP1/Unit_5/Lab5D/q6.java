package Unit_5.Lab5D;

public class q6 {
    public static void drawStars(int n, int m) {
        if (n >= 1 && m >= 1) { // check if user have given valid input
            for (int _m = 1; _m <= m; _m++) { // loop to repeat the shape according to m
                for (int i = 1; i <= n; i++) {
                    for (int j = 0; j < i; j++) { // inner loop for printing the stars
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for (int i = n; i >= 1; i--) { // create nested loop outer loop for printing new line

                    for (int j = 0; j < i; j++) { // inner loop for printing the stars
                        System.out.print("*");
                    }
                    System.out.println("");
                }

            }

        } else { // block will execute when user provide bad input
            System.out.println("Invalid input");
        }

    }
}
