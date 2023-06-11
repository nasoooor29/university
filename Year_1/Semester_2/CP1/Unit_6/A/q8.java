package Unit_6.A;

public class q8 {
    public static int check(int[] aiNumbers) {

        int val = aiNumbers[0];
        for (int iLoop = 1; iLoop < aiNumbers.length; iLoop++) {
            if (aiNumbers[iLoop] < val) {
                val = aiNumbers[iLoop];
            }
        }
        return val;

    }

}
