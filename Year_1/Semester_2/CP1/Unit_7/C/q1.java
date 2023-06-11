package Unit_7.C;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class q1 {
    private static void read10() throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter number");
            arr[i] = scanner.nextLine();
        }
        scanner.close();
        final String FILENAME = "numbers.txt";
        File file = new File(FILENAME);
        PrintWriter writer = new PrintWriter(file);
        for (int i = 0; i < arr.length; i++) {
            writer.println(arr[i]);
        }
        writer.close();
    }
}
