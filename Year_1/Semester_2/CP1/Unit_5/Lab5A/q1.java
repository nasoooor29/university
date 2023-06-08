package Unit_5.Lab5A;

public class q1 {
    public static void simpleWhileLoop() {
        int num = 1; // declaring num and assigning it to 1
        final int NUMBER_OF_INCREMENTS = 10; // assign the number of times you want the loop to contenue with a constant

        while (num <= NUMBER_OF_INCREMENTS) { // create while loop and it will break when the variable num become bigger
                                              // or equal than 10
            System.out.println(num); // printing the number
            num += 1; // increminting the num by one
        }

    }
}
