package Unit_6.A;

public class q2 {
    public static void main(String[] args) {
        String[] arr = { "Manama", "Sitra", "Muharraq", "AlAhli", "Riffa" };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("AlAhli")) {
                System.out.println("Nuwaidrat");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
