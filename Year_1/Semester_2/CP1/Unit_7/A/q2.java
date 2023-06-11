package Unit_7.A;

import java.io.File;

public class q2 {
    public static void listProperties(String filename) {
        File theFile = new File(filename);
        System.out.println(
                String.format(
                        "Printing properties of file %s\n--------------------------\nDoes it exist : %s\nSize in byte : %s\nWritable : %s\nReadable : %s\nIs File : %s\nIs Directory : %s\nHidden : %s\nAbsolutePath : %s",
                        filename,
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
