package Unit_7.C;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class q2 {

    public static String copyFile(String filename) throws IOException {
        File originalFile = new File(filename);
        if (originalFile.exists()) {
            int numberOfLines = GetNumberOfLines(filename);
            String userInput = Ask("Enter a new name for the file:");
            String[] fileLines = ScanFile(filename, numberOfLines);
            writeToFile(userInput, fileLines);
            return userInput;
        } else {
            System.out.println("File was not found");
        }
        return filename;

    }

    private static void writeToFile(String userInput, String[] fileLines) throws FileNotFoundException {
        File file = new File(userInput);
        PrintWriter writer = new PrintWriter(file);
        for (int i = 0; i < fileLines.length; i++) {
            if (fileLines != null) {
                writer.println(fileLines[i]);
            }
        }
        writer.close();
    }

    private static String[] ScanFile(String filename, int fileLines) throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);

        String[] lines = new String[fileLines];
        for (int i = 0; i < fileLines; i++) {
            lines[i] = scanner.nextLine();
        }
        scanner.close();
        return lines;
    }

    private static String Ask(String msg) {
        System.out.println(msg);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        scanner.close();
        return answer;
    }

    private static int GetNumberOfLines(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner fileScanner = new Scanner(file);

        int counter = 0;
        while (fileScanner.hasNextLine()) {
            counter++;
            fileScanner.nextLine();
        }
        fileScanner.close();
        ;
        return counter;
    }
}
