package Unit_7.D;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class q2 {

    static int percentageIncreaseCounter;

    public static void percentageIncrease(String filename, double percent)
            throws FileNotFoundException, IOException {
        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("File does not exist");
            return;
        }

        String[] employees = getEmployees(file);
        File newFile = new File(filename);
        PrintStream writer = new PrintStream(newFile);

        for (String employee : employees) {
            Scanner scanEmployee = new Scanner(employee);
            scanEmployee.useDelimiter("\"");
            String employeeName = scanEmployee.next();
            scanEmployee.next();
            int employeeSalary = (int) (scanEmployee.nextInt() * (percent + 1));
            writeToFile(writer, employeeName, employeeSalary);
        }
    }

    private static void writeToFile(
            PrintStream writer,
            String employeeName,
            int employeeSalary) {
        String line = String.format(
                "\"%s\"\t\"%s\"",
                employeeName,
                employeeSalary);
        writer.println(line);
    }

    private static String[] getEmployees(File file)
            throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String[] items = new String[100];

        percentageIncreaseCounter = 0;
        while (scanner.hasNextLine()) {
            items[percentageIncreaseCounter] = scanner.nextLine();
            percentageIncreaseCounter += 1;
        }
        String[] employees = Arrays.copyOf(items, percentageIncreaseCounter);
        return employees;
    }
}
