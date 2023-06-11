package Unit_7.A;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class q3 {

    public static void main(String[] args) throws IOException {

        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter the name of a folder to read");
        String inp = scn.nextLine();
        File fi = new File(inp);

        createFolderIfNotExists(fi);
        System.out.println();

        System.out.println("Content of folder before creating new file");
        printFileContent(fi);
        System.out.println();

        createFile(fi);
        System.out.println();

        System.out.println("Content of folder after creating new file");
        printFileContent(fi);
        scn.close();
    }

    private static void createFile(File fi) throws IOException {
        System.out.println("Creating new file");
        File f = new File(fi.getCanonicalPath() + File.separator + "newfile.txt");
        f.createNewFile();
    }

    private static void printFileContent(File fi) {
        String[] fiList = fi.list();

        if (fiList.length == 0) {
            System.out.println("folder is empty");
        } else {
            for (int i = 0; i < fiList.length; i++) {
                System.out.println(fiList[i]);
            }

        }
    }

    private static void createFolderIfNotExists(File fi) {
        if (fi.exists() && fi.isDirectory()) {
        } else {
            System.out.println("Folder does not exist, creating it");
            fi.mkdir();
        }
    };
}
