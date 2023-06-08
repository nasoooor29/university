package Unit_8.B;

import java.util.Scanner;

public class q1 {
    static Scanner in = new Scanner(System.in);
    static final int PASSWORD = 1234;
    static int balance = 7500;

    public static void main(String[] args) {
        int pwd = getPassword();
        if (checkPassword(pwd)) {
            int amount = getAmount();
            boolean suff = checkBalance(amount);
            if (suff) {
                withdrawCash(amount);
            } else {
                System.out.println("Insufficient funds");
            }
            displayBalance();
        } else {
            System.out.println("invalid password");
        }

    }

    private static int getPassword() {
        System.out.println("Enter your password");
        return in.nextInt();
    }

    private static boolean checkPassword(int pass) {
        if (pass == PASSWORD) {
            return true;
        } else {
            return false;
        }

    }

    private static boolean checkBalance(int i) {

        if (balance - i > 0) {
            return true;
        } else {
            return false;
        }
    }

    private static void withdrawCash(int i) {
        balance -= i;
    }

    private static void displayBalance() {
        System.out.println(
                String.format("Your balance is %s", balance));
    }

    private static int getAmount() {
        System.out.println("Enter amount");
        return in.nextInt();
    }
}
