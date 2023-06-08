package Unit_8.B;

import java.util.Scanner;

public class q2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        calculatePackageCost();
        // System.out.println(getDimension("aaaa"));
        // double cost = determineDelMethodCost();
        // System.out.println("Cost of land delivery is: " + cost);
        // System.out.println("Volume Cost of a 1 by 1 by 1 package is: " +
        // calculateVolumeCost(1, 1, 1));
        // System.out.println("Weight Cost of a 10.25Kg package is: " +
        // calculateWeightCost(10.25));
    }

    private static double getDimension(String dim) {
        System.out.printf("Enter a dimension: %s\n", dim);
        return input.nextDouble();
    }

    private static double getVolumePrice(double vol) {
        if (vol <= 0.5) {
            return 2.7;
        } else if (vol >= 0.5) {
            return 4.8;
        } else {
            return 0;
        }
    }

    private static double getWeightPrice(double weight) {
        if (weight < 10) {
            return 0.98;
        } else if (weight >= 10 && weight <= 50) {
            return 1.13;
        } else if (weight > 50) {
            return 1.27;
        } else {
            return 0;
        }
    }

    private static boolean isMethodAvaliable(String method) {
        String[] methods = { "land", "sea", "air" };
        for (int i = 0; i < methods.length; i++) {
            if (method.equals(methods[i])) {
                return true;
            }
        }
        return false;
    }

    private static double calculateWeightCost(double d) {
        return getWeightPrice(d) * d;
    }

    private static double calculateVolumeCost(double length, double width, double height) {
        double vol = length * width * height;
        double price = getVolumePrice(vol);
        System.out.println(price);
        return price;
    }

    private static double determineDelMethodCost() {
        System.out.println("Enter delivery method (land, sea, air)");
        String method = input.nextLine();
        if (isMethodAvaliable(method)) {
            switch (method) {
                case "land":
                    return 3.0;
                case "air":
                    return 5.50;
                case "sea":
                    return 7.20;
                default:
                    return 0;
            }

        } else {
            System.out.println("Error: Invalid delivery method");
            return 0;
        }
    }

    public static void calculatePackageCost() {

        double length = getDimension("length");
        double width = getDimension("width");
        double height = getDimension("height");
        double weight = getDimension("weight");

        double weightCost = calculateWeightCost(weight);
        double volumeCost = calculateVolumeCost(length, width, height);
        input.nextLine();
        double delCost = determineDelMethodCost();
        System.out.println("-------------------------");
        System.out.println(volumeCost);
        System.out.println(weightCost);
        System.out.println(delCost);
        System.out.println("-------------------------");
        System.out.println(
                String.format(
                        "Total Cost: %s",
                        (volumeCost + weightCost + delCost)));
    }
}
