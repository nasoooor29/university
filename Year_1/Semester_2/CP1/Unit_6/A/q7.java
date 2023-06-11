package Unit_6.A;

public class q7 {
    public static boolean check(int[] iNumbers) {

        boolean bValid = true;
        for (int i = 0; i < iNumbers.length - 1; i++) {
            if (iNumbers[i] >= iNumbers[i + 1]) {
                bValid = false;
            }
        }
        return bValid;
    }

}
