package Unit_5.Lab5A;

public class q2 {
    public static void simpleDoWhile() {
        int num = 1; // declaring num and assigning it to 1
        final int numberOfIncrements = 10; // assign the number of times you want the loop to contenue with a constant

        do {
            System.out.println(num); // printing the number
            num += 1; // increminting the num by one so it don't become infinite loop
        } while (num <= numberOfIncrements);

    }
}
