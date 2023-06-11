package Unit_5.D;

public class q4 {
    public static void drawStars(int n) {
        if (n > 0) { // check if number is positive
            for (int i = 1; i <= n; i++) { // create nested loop outer loop for printing new line
                for (int j = 0; j < i; j++) { // inner loop for printing the stars
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else { // will execute if the number is negative or zero
            System.out.println("Invalid input");
        }
    }
}
