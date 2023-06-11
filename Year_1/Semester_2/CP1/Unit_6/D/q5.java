package Unit_6.D;

public class q5 {
    private static int occurrences(int nb, int[] numbers) {
        int occ = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == nb) {
                occ += 1;
            }
        }
        return occ;
    }
}
