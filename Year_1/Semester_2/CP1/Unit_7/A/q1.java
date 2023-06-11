package Unit_7.A;

import java.io.File;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String fileName = scn.nextLine();
        scn.close();
        File theFile = new File(fileName);
        System.out.println(
                String.format(
                        "Printing properties of file\n--------------------------\nDoes it exist : %s\nSize in byte : %s\nWritable : %s\nReadable : %s\nIs File : %s\nIs Directory : %s\nHidden : %s\nAbsolutePath : %s",
                        theFile.exists(),
                        theFile.length(),
                        theFile.canWrite(),
                        theFile.canRead(),
                        theFile.isFile(),
                        theFile.isDirectory(),
                        theFile.isHidden(),
                        theFile.getAbsolutePath())

        );
    }
}