package Unit_4.B;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Choose an option to display the corresponding piece of information:");
        System.out.println(
                "1.Capital of Bahrain\n2.Population of Bahrain\n3.Climate of Bahrain\n4.GDP of Bahrain\n5.Size of Bahrain (square km)\n");
        String inp = scn.nextLine();
        // i used "String" data type here because i won't use the phone number in any
        // mathematical calculation

        if (inp.equals("1")) {
            System.out.println("Your choice was 1. The capital of Bahrain is Manama.");
        } else if (inp.equals("2")) {
            System.out.println("Your choice was 2. The population of Bahrain: 1,039,297.");
        } else if (inp.equals("3")) {
            System.out.println(
                    "Your choice was 3. Bahrain has two seasons: an extremely hot summer and a relatively mild winter.");
        } else if (inp.equals("4")) {
            System.out.println("Your choice was 4. Bahrain's GDP was 35.31 billion USD in 2017.");
        } else if (inp.equals("5")) {
            System.out.println("Your choice was 5. Bahrain is 765.3 square km.");
        } else {
            System.out.println("You entered a wrong choice.");
        }

        scn.close();
    }
}
