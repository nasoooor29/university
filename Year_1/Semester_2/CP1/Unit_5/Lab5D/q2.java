package Unit_5.Lab5D;

public class q2 {
    public static int sumOfValues(int startValue, int stopValue, int step) {
        int sum = 0; // declare sum variable
        for (; startValue <= stopValue; startValue += step) { // loop from the start value until it reach stop value and
                                                              // add the step for every iteration
            sum = sum + startValue; // add the start value to sum
        }
        System.out.println(sum); // display sum

        return sum; // return the sum variable
    }
}
