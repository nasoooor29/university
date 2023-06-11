package Unit_6.C;

import java.util.Scanner;

public class q1 {

    public static String Ask(Scanner scn, String prompt) {
        System.out.println(prompt);
        String result = scn.nextLine();
        return result;

    }

    public static String[] addIfAviliable(String[] arr, String value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = value;
                return arr;
            } else {
                continue;
            }
        }
        return arr;
    }

    public static boolean canAddValue(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                return true;
            } else {
                continue;
            }
        }
        return false;
    }

    public static String[] addName(String[] names) {
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < names.length; i++) {
            if (!canAddValue(names)) {
                System.out.println("Array full");
                break;
            }
            String stuName = Ask(scn, "Add a student name");
            addIfAviliable(names, stuName);

            String goAhead = Ask(scn, "Name added successfully. Add another? Enter y or n");
            if (goAhead.equals("y")) {

            } else if (goAhead.equals("n")) {
                break;
            }

        }
        System.out.println("Updated Array");
        for (String i : names) {
            if (i != null) {
                System.out.println(i);

            }
        }
        return names;
    }
}
