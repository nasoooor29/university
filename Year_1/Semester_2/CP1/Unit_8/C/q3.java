package Unit_8.C;

public class q3 {
    public static void main(String[] args) {
        trianglePrint(5);

    }

    private static void linePrint(int length) {
        // give the method the length of the line and it will print it
        for (int j = 0; j < length; j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    private static void trianglePrint(int height) {
        if (height % 2 == 0) {
            System.out.println("size must be an odd number");
        } else {
            // Print the upper half of the triangle
            for (int i = 1; i <= height; i += 2) {
                linePrint(i);
            }

            // Print the lower half of the triangle
            for (int i = height - 2; i >= 1; i -= 2) {
                linePrint(i);
            }
        }
    }
}
