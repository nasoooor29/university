package Unit_8.B;

import java.util.Scanner;

public class q2V2 {
    static Scanner input = new Scanner(System.in);

    public static double getDimension(String dimension) {
        double num;
        if (dimension == "length") {
            System.out.println("Enter a dimension: Length");

        } else if (dimension == "width") {
            System.out.println("Enter a dimension: Width");

        } else if (dimension == "height") {
            System.out.println("Enter a dimension: Height");

        } else if (dimension == "weight") {
            System.out.println("Enter a dimension: Weight");

        }
        num = input.nextDouble();
        if (num > 0) {

        } else {
            while (num < 0) {
                System.out.println("Error: dimension must be greater than 0");
                num = input.nextDouble();
            }
        }
        return num;
    }

    public static double calculateWeightCost(double weight) {
        if (weight < 10) {
            weight = weight * 0.98;
        } else if (weight >= 10 && weight <= 50) {
            weight = weight * 1.13;

        } else if (weight > 50) {
            weight = weight * 1.27;

        }
        return weight;
    }

    public static double calculateVolumeCost(double length, double width, double height) {
        double cost;
        double volume;
        volume = length * width * height;
        if (volume < 0.5) {
            cost = 2.70;
        } else {
            cost = 4.80;
        }
        return cost;
    }

    public static double determineDelMethodCost() {
        System.out.println("Enter delivery method (land, sea, air)");
        double cost = 0;
        String del = input.nextLine();
        while (!del.equals("land") && !del.equals("sea") && !del.equals("air")) {
            System.out.println("Error: Invalid delivery method");
            del = input.nextLine();
        }
        if (del.equals("land")) {
            cost = 3.00;
        } else if (del.equals("sea")) {
            cost = 5.50;
        } else if (del.equals("air")) {
            cost = 7.20;
        }
        return cost;
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

        System.out.println("Total Cost: " + (volumeCost + weightCost + delCost));
    }
}
