package Unit_3.B;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter the radius of the circle: ");
        double rad = scn.nextDouble();

        DecimalFormat dec = new DecimalFormat("##.00");

        System.out.printf("The circumference of the circle is: %s\n", dec.format(2 * Math.PI * rad));
        System.out.printf("The area of the circle is: %s",
                dec.format(
                        Math.PI * (Math.pow(rad, 2))));

        scn.close();
    }
}
