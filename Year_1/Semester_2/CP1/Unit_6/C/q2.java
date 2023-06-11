package Unit_6.C;

public class q2 {

    public static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }

    }

    public static String[] deleteItem(String[] names, String name) {
        int foundIt = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                if (names[i].equals(name)) {
                    foundIt = i;
                    break;
                }
            }
        }
        if (foundIt >= 0) {
            names[foundIt] = null;
            System.out.println("Philippe was deleted");
            System.out.println("Updated Array");
            printArr(names);
        } else {
            System.out.println("Philippe was not found");
        }
        return names;
    }

}
