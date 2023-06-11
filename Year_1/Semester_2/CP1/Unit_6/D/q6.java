package Unit_6.D;

public class q6 {
    private static double average(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return (double) sum / numbers.length;
    }

}
