package Unit_5.A;

public class q6 {
    public static void simpleWhileLoop(int NUMBER_OF_INCREMENTS) {
        int num = 1; // declaring num and assigning it to 1

        while (num <= NUMBER_OF_INCREMENTS) { // create while loop and it will break when the variable num become bigger
                                              // or equal than 10
            System.out.println(num); // printing the number
            num += 1; // increminting the num by one
        }
    }
}
