package Unit_5.Lab5C;

import java.text.DecimalFormat;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        final double CHANGERATE = 1.85;
        double val = 1;
        DecimalFormat df = new DecimalFormat("#.##");
        Scanner scn = new Scanner(System.in);

        System.out.println("BD to EUR converter");
        while (true) {
            System.out.println("Please enter amount (-99 to quit):");
            val = scn.nextDouble();
            if (val != -99) {
                String formattedVal = df.format(val);
                String formattedValCalc = df.format(val * CHANGERATE);

                System.out.println(String.format("%sBD is equal to %sEuros", formattedVal, formattedValCalc));
            } else {
                break;
            }
        }

        scn.close();

        // System.out.println(df.format(1.3));
    }
}
