package Unit_6.D;

public class q4 {
    private static char[] decomposeString(String word) {
        int wLen = word.length();
        char[] arr = new char[wLen];
        for (int i = 0; i < wLen; i++) {
            arr[i] = word.charAt(i);
        }
        return arr;
    }

}
