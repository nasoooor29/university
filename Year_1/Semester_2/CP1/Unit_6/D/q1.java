package Unit_6.D;

public class q1 {
    public static int sumElements(int[] data) {
        int i = 0;
        int sum = 0;
        while (i < data.length) {
            sum += data[i];
            i += 1;
        }

        return sum;
    }

}
