package Unit_7.B;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q2 {
    private static void readStudentList(String userInp) {
        File file = new File(userInp);
        Scanner reader = readFile(file);
        int counter = 1;
        while (reader.hasNext()) {
            String msg = String.format(
                    "Student no.%s is %s",
                    counter,
                    reader.nextLine());
            System.out.println(msg);
            counter += 1;
        }
    }

    private static Scanner readFile(File file) {
        try {
            Scanner fileReader = new Scanner(file);
            return fileReader;
        } catch (FileNotFoundException e) {
            System.out.println("Cannot read the file");
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }
}
