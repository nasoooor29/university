package Unit_7.D;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class q1 {

    public static int AskInt(String msg, Scanner scanner) {
        System.out.println(msg);
        return scanner.nextInt();

    }

    public static int[] addToFile(String filename) throws FileNotFoundException, IOException {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File does not exist");
            System.exit(0);
        }

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        FileOutputStream appender = new FileOutputStream(file, true);
        PrintStream writer = new PrintStream(appender);

        for (int i = 0; i < arr.length; i++) {
            int inp = AskInt("Enter a number:", scanner);
            arr[i] = inp;
            writer.println(inp);
        }
        writer.close();

        return arr;
    }
}
