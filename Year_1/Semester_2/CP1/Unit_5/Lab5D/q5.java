package Unit_5.Lab5D;

public class q5 {
    public static void drawStars(int n, boolean isUpSideDown) {

        if (n > 0) { // check if number is positive
            if (isUpSideDown) { // check upsidedown state

                for (int i = n; i >= 1; i--) { // create nested loop outer loop for printing new line

                    for (int j = 0; j < i; j++) { // inner loop for printing the stars
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            } else {
                for (int i = 1; i <= n; i++) { // create nested loop outer loop for printing new line
                    for (int j = 0; j < i; j++) { // inner loop for printing the stars
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }

        } else { // will execute if the number is negative or zero
            System.out.println("Invalid input");
        }
    }
}
