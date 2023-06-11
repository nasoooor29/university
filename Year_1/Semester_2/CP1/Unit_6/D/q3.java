package Unit_6.D;

public class q3 {
    public static String longestString(String[] arr) {
        int len = 0;
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            String string = arr[i];
            if (len < string.length()) {
                longest = i;
                len = string.length();
            }
        }
        return arr[longest];
    }
}
