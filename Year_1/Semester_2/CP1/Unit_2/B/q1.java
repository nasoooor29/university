package Unit_2.B;

public class q1 {
    public static void main(String[] args) {
        // declare 3 integer variables and a float average variable
        int int1;
        int int2;
        int int3;
        float f1;

        // initialize variables
        int1 = 5;
        int2 = 7;
        int3 = 2;

        // calculate average

        f1 = (int1 + int2 + int3) / 3.0f;
        // System.out.println(f1);
        // print result to user

        String text = String.format("values of three integers are: %d %d %d and the average is:  ", int1, int2, int3);
        System.out.println(text + f1);

    }
}
