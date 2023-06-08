package Unit_4.D;

public class q1 {
    public static void main(String[] args) {
        System.out.println(XOnEitherSides("Xabi Alonso"));
    }

    public static boolean XOnEitherSides(String text) {
        String lowerText = text.toLowerCase();
        int tlen = text.length();
        if (tlen >= 2) {
            char firstChar = lowerText.charAt(0);
            char lastChar = lowerText.charAt(tlen - 1);

            if (Character.compare('x', firstChar) == 0 || Character.compare('x', lastChar) == 0) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }
}
