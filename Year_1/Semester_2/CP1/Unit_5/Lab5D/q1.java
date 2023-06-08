package Unit_5.Lab5D;

public class q1 {
    public static void products(int startValue, int stopValue) {
        int multiplied = 1; // initial variable with starting value of one
        for (; startValue <= stopValue; startValue++) { // the loop will stop if the startvalue reached the stopvalue
            multiplied *= startValue; // multipy the start value by the past variable then reassign
        }
        System.out.println(multiplied); // display the result
    }
}
