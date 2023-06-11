package Unit_7.B;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.MessageFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class q1 {

    public static void main(String[] args) {
        Scanner usrRead = new Scanner(System.in);
        System.out.println("Please enter the name of a file to read");
        String userInp = usrRead.nextLine();
        usrRead.close();

        File file = new File(userInp);

        Scanner reader = readFile(file);
        ArrayList<String> fileLines = getFileData(reader);
        for (int i = 0; i < fileLines.size(); i++) {
            String msg = MessageFormat.format(
                    "Student no.{0} is {1}",
                    i + 1,
                    fileLines.get(i));
            System.out.println(msg);
        }
    }

    private static ArrayList<String> getFileData(Scanner reader) {

        ArrayList<String> arr = new ArrayList<String>();

        while (reader.hasNext()) {
            arr.add(reader.nextLine());
            // System.out.println(reader.nextLine());
        }
        return arr;
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