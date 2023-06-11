package Unit_8.D;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class q3 {
  

  public static void main(String[] args) throws IOException {

        ls("Unit_1");
    }

    private static void ls(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            System.out.println("Folder does not exist");
        }
        if (file.isDirectory()) {
            String[] arr = file.list();
            for (int i = 0; i < arr.length; i++) {
                File f = new File(
                        String.format("%s%s%s",
                                file.getCanonicalFile(),
                                File.separator,
                                arr[i]));

                if (!f.isHidden()) {
                    System.out.println(
                            String.format("%s%s%s, %s",
                                    str,
                                    File.separator,
                                    arr[i],
                                    f.length()));
                }

            }
        }
    }
}
