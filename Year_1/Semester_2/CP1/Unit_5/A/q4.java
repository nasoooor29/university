package Unit_5.A;

public class q4 {
    public static void simpleDoWhile(final int numberOfIncrements) {
        int num = 1; // declaring num and assigning it to 1

        do {
            System.out.println(num); // printing the number
            num += 1; // increminting the num by one so it don't become infinite loop
        } while (num <= numberOfIncrements); // the loop will contenue until the num reate the number of increments

    }
}
