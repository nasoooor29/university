package Unit_5.Lab5D;

public class q3 {
    public static void printOddNumber(int startValue, int stopValue) {
        for (; startValue <= stopValue; startValue++) { // loop starting from startvalue until the stop value
            if (startValue % 2 != 0) { // if will activate the number cannot be divided by 2
                System.out.println(startValue); // print if the number
            }
        }
    }
}
