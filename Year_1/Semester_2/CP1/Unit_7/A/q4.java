package Unit_7.A;

import java.io.File;
import java.io.IOException;

public class q4 {
    private static void createFileIn(String folderName) {
        File folder = new File(folderName);

        if (exists(folder)) {
            System.out.println("Folder Content before creating new file");
            printFileContent(folder);
            System.out.println();

            createFile(folder);
            System.out.println();
            System.out.println();

            System.out.println("Folder content after creating new file");
            printFileContent(folder);

        } else {
            System.out.println("Folder does not exist");
        }

    }

    private static boolean exists(File folder) {
        if (folder.exists() && folder.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }

    private static void createFile(File folder) {
        System.out.println("Creating new file");

        try {
            File f = new File(folder.getCanonicalPath() + File.separator + "newfile.txt");
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printFileContent(File fi) {
        String[] fiList = fi.list();
        if (fiList == null) {
            System.out.println("folder is empty");
        } else {
            if (fiList.length == 0) {
                System.out.println("folder is empty");
            } else {
                for (int i = 0; i < fiList.length; i++) {
                    System.out.println(fiList[i]);
                }

            }

        }

    }
}
